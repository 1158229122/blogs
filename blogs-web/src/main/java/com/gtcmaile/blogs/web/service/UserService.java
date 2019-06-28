package com.gtcmaile.blogs.web.service;

import com.gtcmaile.blogs.pojo.User;
import com.gtcmaile.blogs.pojo.response.Result;
/**
 * created by jim on 19-6-10 下午2:41
 */
public interface UserService {
    /**
     * 获取所有的用户
     * @return
     */
    Result getAll();

    /**
     * 用户注册
     * @param user
     * @return
     */
    Result register(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    Result login(User user);

    /**
     * 获取验证码
     * @param email
     * @return
     */
    Result getCheck(String email);

    /**
     * 是否处于登录状态
     * @param userID
     * @param token
     * @return
     */
    Result isLogin(Integer userID, String token);
}
