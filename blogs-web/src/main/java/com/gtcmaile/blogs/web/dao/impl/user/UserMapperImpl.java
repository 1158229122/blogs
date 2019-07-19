package com.gtcmaile.blogs.web.dao.impl.user;

import com.gtcmaile.blogs.pojo.User;
import com.gtcmaile.blogs.util.StringUtils;
import com.gtcmaile.blogs.web.dao.user.UserMapper;
import com.gtcmaile.blogs.web.dao.base.BaseDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @Author: jim
 * @Date: 2019/7/19 8:55
 * 每个方法的作用请在接口成查看
 * @Version 1.0
 */
@Repository
public class UserMapperImpl extends BaseDaoImpl<User> implements UserMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserByPhone(String phone) {
        User user = new User();
        user.setEmail(phone);
        return getUserByCondition(user);
    }

    @Override
    public User getUserByEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return getUserByCondition(user);
    }

    @Override
    public User login(User user) {
        return getUserByCondition(user);

    }

    private User getUserByCondition(User user) {
        List<User> byCondition = super.findByCondition(user, null);
        if (StringUtils.isListNull(byCondition)){
            return null;
        }else {
            return byCondition.get(0);
        }
    }

    @Override
    public List<User> getAll() {
        return findAll();
    }
}
