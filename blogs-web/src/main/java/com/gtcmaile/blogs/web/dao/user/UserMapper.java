package com.gtcmaile.blogs.web.dao.user;

import java.util.List;

import com.gtcmaile.blogs.pojo.user.User;


public interface UserMapper {

    /**
     * 获取使用户根据手机号码
     * @param phone
     * @return
     */
    User getUserByPhone(String phone);

    /**
     * 获取用户根据邮箱获取
     * @param email
     * @return
     */
    User getUserByEmail(String email);
    /**
     * 根据手机号码或则邮箱或用户名进行登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 查询所有
     * @return
     */
    List<User> getAll();
}