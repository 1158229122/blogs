package com.gtcmaile.blogs.web.dao.impl;

import com.alibaba.fastjson.JSON;
import com.gtcmaile.blogs.pojo.User;
import com.gtcmaile.blogs.pojo.common.PageData;
import com.gtcmaile.blogs.web.dao.UserMapper;
import com.gtcmaile.blogs.web.dao.base.BaseDaoImpl;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @Author: jim
 * @Date: 2019/7/19 8:55
 * @Version 1.0
 */
@Repository
public class UserMapperImpl extends BaseDaoImpl<User> implements UserMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserByPhone(String phone) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public List<User> getAll() {
        User user = new User();
        user.setAge(15);
        user.setNickname("你好fdfd");

        super.save(user);

        return findAll();
    }
}
