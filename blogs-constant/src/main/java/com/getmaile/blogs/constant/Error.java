package com.getmaile.blogs.constant;

/**
 * created by jim on 19-6-11 上午10:22
 */
public interface Error {
    //签名错误 200-300之间非法请求
    String SIGN_ERROR = "201";
    //频繁请求
    String ERROR_FREQUENTLY_REQUEST = "202";
    //默认错误，服务段想要将错误信息返回给前段
    String DEFAULT_ERROR="101";
    //没有登录错误
    String NO_LOGIN_ERROR="121";
}
