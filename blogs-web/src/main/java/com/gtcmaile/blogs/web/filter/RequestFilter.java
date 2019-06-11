package com.gtcmaile.blogs.web.filter;

import com.alibaba.fastjson.JSON;
import com.getmaile.blogs.constant.Error;
import com.gtcmaile.blogs.pojo.response.Result;
import com.gtcmaile.blogs.util.Md5Utils;
import com.gtcmaile.blogs.util.SecurityUtil;
import com.gtcmaile.blogs.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * created by jim on 19-6-10 下午2:34
 * 请求处理，处理非法请求，恶意攻击，防盗链等
 */
@Component
public class RequestFilter implements Filter {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RedisTemplate redisTemplate;
    @Value("${spring.profiles.active}")
    private String isCheck;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setContentType("text/html; charset=UTF-8");
        boolean flag = false;
        if (isCheck.equals("dev")){
            flag = true;
        }
        if("OPTIONS".equals(request.getMethod())||flag){
            filterChain.doFilter(request,response);
            return;
        }
        //校验请求的合法性
        if (checkSign(request,response)&&checkRequest(request,response)&&requestNum(request,response)){
            filterChain.doFilter(request,response);
        }

    }

    /**
     * 检查是否频繁请求
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    private boolean requestNum(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Map<String, String[]> parameterMap = new HashMap<>(request.getParameterMap());
        String requestHash = Md5Utils.getMD5(JSON.toJSONString(parameterMap) + request.getRemoteAddr() + request.getRequestURI());

        if (null != redisTemplate.opsForValue().get(requestHash)) {
            log.debug("频繁请求，拒绝响应!");
            response.getWriter().print(JSON.toJSONString(Result.build(Error.ERROR_FREQUENTLY_REQUEST,"频繁请求")));
            return false;
        }
        redisTemplate.opsForValue().set(requestHash, 1, 1, TimeUnit.SECONDS);
        return true;
    }

    /**
     * 检查签名
     * @param request
     * @param response
     * @return
     */
    private boolean checkSign(HttpServletRequest request,HttpServletResponse response){
        try{
            //检查签名是否合法，参数是否被串改
            Enumeration<String> parameterNames = request.getParameterNames();
            //获取参数摘要
            HashMap<String, String> globalParam = new HashMap<>(15);
            while (parameterNames.hasMoreElements()) {
                String name = parameterNames.nextElement();
                if (!"sign".equals(name)) {
                    globalParam.put(name, request.getParameter(name));
                }
            }
            String userID = request.getParameter("userID");
            String serverSign = SecurityUtil.getSignature(globalParam, "gtcmail0716");
            String sign = request.getParameter("sign");
            //判断摘要是否一致
            if (!StringUtils.isEmpty(sign)&&serverSign.equals(sign)) {
                return true;
            }
            log.error("秘钥错误!api:{},\nuserID:{},platform:{},serverSign:{},clientSign:{}",
                    request.getRequestURI(),
                    userID, request.getHeader("platform"), serverSign, sign);
            response.getWriter().print(JSON.toJSONString(new Result<>(Error.SIGN_ERROR, "签名错误!")));
            return false;
        }catch (IOException e){
            return false;
        }
    }

    /**
     * 检查请求的时间是否完整
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    private boolean checkRequest(HttpServletRequest request,HttpServletResponse response) throws IOException {
        //获取签名
        String sign = request.getParameter("sign");
        String userID = request.getParameter("userID");
        String time = request.getParameter("requestTime");
        String requestURI = request.getRequestURI();
        if (!org.apache.commons.lang3.StringUtils.isEmpty(time)) {
            if (!org.apache.commons.lang3.StringUtils.isEmpty(userID)) {
                String key = StringUtils.concat("expiresTime", userID);
                String value = Md5Utils.getMD5(StringUtils.concat(requestURI,sign));
                String expiresTime = (String) redisTemplate.boundHashOps(key).get(value);
                if (expiresTime == null) {
                    redisTemplate.boundHashOps(key).put(value, time);
                    redisTemplate.expire(key, 10, TimeUnit.MINUTES);
                } else {
                    if (Long.valueOf(expiresTime) >= Long.valueOf(time)||(Long.valueOf(time)+300000)<new Date().getTime()) {
                        log.info("cli:" + time + "==service" + expiresTime);
                        response.getWriter().print(JSON.toJSONString(Result.build(Error.DEFAULT_ERROR,"非法请求")));
                        return false;
                    } else {
                        redisTemplate.boundHashOps(key).put(value, time);
                        redisTemplate.expire(key, 10, TimeUnit.MINUTES);
                    }
                }
            } else {
                String remoteAddr = request.getRemoteAddr();
                String key = Md5Utils.getMD5(StringUtils.concat("expiresTime", remoteAddr));
                String value = Md5Utils.getMD5(StringUtils.concat(requestURI,sign));
                String expiresTime = (String) redisTemplate.boundHashOps(key).get(value);
                if (expiresTime == null) {
                    redisTemplate.boundHashOps(key).put(value, time);
                    redisTemplate.expire(key, 10, TimeUnit.MINUTES);
                } else {
                    if (Long.valueOf(expiresTime) >= Long.valueOf(time)||(Long.valueOf(time)+300000)<new Date().getTime()) {
                        response.getWriter().print(JSON.toJSONString(Result.build(Error.DEFAULT_ERROR,"非法请求")));
                        log.info("cli:" + time + "==service" + expiresTime);
                        return false;
                    } else {
                        redisTemplate.boundHashOps(key).put(value, time);
                        redisTemplate.expire(key, 1, TimeUnit.HOURS);
                    }
                }
            }
        }
        return true;
    }
}
