package com.gtcmaile.blogs.web.interceptor;

import com.alibaba.fastjson.JSON;
import com.gtcmaile.blogs.pojo.user.User;
import com.gtcmaile.blogs.pojo.response.Result;
import com.gtcmaile.blogs.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * created by jim on 19-6-11 上午9:38
 * 登录校验
 */
public class LoginCheck extends HandlerInterceptorAdapter {
    @Autowired
    private RedisTemplate redisTemplate;
    @Value("${spring.profiles.active}")
    private  String isCheck;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("text/html; charset=UTF-8");
        boolean flag = false;
        if ("dev".equals(isCheck)){
            flag = true;
        }
        if("OPTIONS".equals(request.getMethod())||flag){
            return true;
        }
        String userID = request.getParameter("userID");
        String token = request.getParameter("token");
        if (!StringUtils.isNullOrEmpty(userID,token)){
            User loginUsers = (User) redisTemplate.boundValueOps(StringUtils.concat("LoginUsers", userID)).get();
            if (loginUsers!=null||token.equals(loginUsers.getToken())){
                return true;
            }
        }
        response.getWriter().print(JSON.toJSONString(Result.build("121","用户信息异常")));
        return false;
    }
}
