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
    //登录错误异常102-199
    //没有登录报错会跳转到登录
    String NO_LOGIN_ERROR="121";
    //用户未激活
    String NO_ACTIVATE_ERROR="122";
    //用户被封禁
    String USER_CLOSE="123";
    //用户名或密码错误
    String ERROR_PASSWORD_OR_USER="124";
}
