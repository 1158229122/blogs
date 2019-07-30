package com.gtcmaile.blogs.web.service.impl.user;

import com.getmaile.blogs.constant.Error;
import com.getmaile.blogs.constant.LoginConstant;
import com.gtcmaile.blogs.pojo.user.User;
import com.gtcmaile.blogs.pojo.response.Result;
import com.gtcmaile.blogs.util.MailUtils;
import com.gtcmaile.blogs.util.StringUtils;
import com.gtcmaile.blogs.util.encryption.UuidUtil;
import com.gtcmaile.blogs.web.dao.user.UserMapper;
import com.gtcmaile.blogs.web.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
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
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result getAll() {
        long time = new Date().getTime();
        List<User> users = userMapper.getAll();
        long time1 = new Date().getTime();
        System.out.println(time1-time);
        return Result.success(users);
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
//        userMapper.insertSelective(user)
        return Result.autoResult(1);
    }

    @Override
    public Result login(User user) {
        User login = userMapper.login(user);
        if (login!=null){
            if (login.getStaus()==0){
                //使用uuid生成token
                String uuid = UuidUtil.getUuid();
                login.setToken(uuid);
                redisTemplate.boundValueOps(StringUtils.concat("LoginUsers",login.getId()+"")).set(login);
                //登录超时7天后过期
                redisTemplate.expire(StringUtils.concat("LoginUsers",login.getId()+""), LoginConstant.LOGIN_OUT_TIME, TimeUnit.DAYS);
                return Result.success(login);
            }else if (login.getStaus()==1){
                return Result.build(Error.USER_CLOSE,"账号被封禁");
            }else if(login.getStaus()==2){
                return Result.build(Error.NO_ACTIVATE_ERROR,"账号未激活");
            }else {
                return Result.build(Error.DEFAULT_ERROR,"发生未知错误");
            }

        }
        return Result.build(Error.ERROR_PASSWORD_OR_USER,"用户名或密码错误");
    }

    @Override
    public Result getCheck(String email) {
        String check = UuidUtil.getCheck();
        redisTemplate.boundValueOps(email).set(check,5,TimeUnit.MINUTES);
        boolean boole = MailUtils.sendMail(email, StringUtils.concat("您的验证码是:", check), "验证码");
        return Result.auto(boole);
    }

    @Override
    public Result isLogin(Integer userID, String token) {
        try{
            User loginUsers = (User) redisTemplate.boundValueOps(StringUtils.concat("LoginUsers", userID + "")).get();
            if (loginUsers.getToken().equals(token)){
                return Result.success(true);
            }
        }catch (Exception e){
            //主要防止空指针
            logger.info(e.getMessage());
            return Result.error("发生未知错误");
        }
        return Result.success(false);
    }
}
