package com.gtcmaile.blogs.web.service.impl;

import com.getmaile.blogs.constant.Error;
import com.getmaile.blogs.constant.LoginConstant;
import com.gtcmaile.blogs.pojo.User;
import com.gtcmaile.blogs.pojo.response.Result;
import com.gtcmaile.blogs.util.StringUtils;
import com.gtcmaile.blogs.web.dao.UserMapper;
import com.gtcmaile.blogs.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * created by jim on 19-6-10 下午2:42
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public Result getAll() {
        return Result.success(userMapper.selectByExample(null));
    }

    @Override
    public Result register(User user) {
        if(StringUtils.isNullOrEmpty(user.getPassword(),user.getNickname())){
            return Result.build(Error.DEFAULT_ERROR,"缺少必要信息");
        }
        //手机号码检测
        if (!StringUtils.isEmpty(user.getPhone())){
            User userByPhone = userMapper.getUserByPhone(user.getPhone());
            if (userByPhone!=null){
                return Result.build(Error.DEFAULT_ERROR,"该手机号已经被注册");
            }
        }
        //邮箱检测
        if (!StringUtils.isEmpty(user.getEmail())){
            User userByPhone = userMapper.getUserByEmail(user.getPhone());
            if (userByPhone!=null){
                return Result.build(Error.DEFAULT_ERROR,"该邮箱已被注册");
            }
        }

        return Result.autoResult(userMapper.insertSelective(user));
    }

    @Override
    public Result login(User user) {
        User login = userMapper.login(user);
        if (login!=null){
            //使用uuid生成token
            String uuid = UUID.randomUUID().toString();
            login.setToken(uuid);
            redisTemplate.boundValueOps(StringUtils.concat("LoginUsers",user.getId()+"")).set(user);
            redisTemplate.expire(StringUtils.concat("LoginUsers",user.getId()+""), LoginConstant.LOGIN_OUT_TIME, TimeUnit.DAYS);
            return Result.success(login);
        }
        return Result.build(Error.DEFAULT_ERROR,"登录失败");
    }

    @Override
    public Result getCheck(String email) {
        return null;
    }
}
