package com.gtcmaile.blogs.web.filter;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * created by jim on 19-6-9 下午3:40
 * 日志处理
 */
@Component
public class LogFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if(!"OPTIONS".equals(request.getMethod())){
            String userID = request.getParameter("userID");
            Map<String, String[]> parameterMap = new HashMap<>(request.getParameterMap());
            logger.info(
                    "-----------------------------------------------------------------------------------------------------------" +
                            "\r\napi:{}\nuserID:{}\nremoteHost:{}\nplatform:{}\nappVersion:{}\nphoneModel:{}\n{}",
                    request.getRequestURI(),
                    null == userID ? 0 : userID,
                    request.getHeader("x-real-ip"),
                    request.getHeader("platform"),
                    request.getHeader("version"),
                    request.getHeader("phonetype"),
                    JSON.toJSONString(parameterMap));
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }


}
