package com.gtcmaile.blogs.web.api.user;

import com.gtcmaile.blogs.pojo.User;
import com.gtcmaile.blogs.pojo.response.Result;
import com.gtcmaile.blogs.web.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * created by jim on 19-6-10 下午2:38
 */
@Api(produces = "用户接口")
@RestController
@RequestMapping("/api/user/")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public UserService userService;
    @GetMapping("getAll")
    @ApiOperation(value = "查询所有" ,  notes="查询所有")
    public Result getAll(){
        return userService.getAll();
    }
    @ApiOperation(value = "注册" ,  notes="用户注册")
    @PostMapping("register")
    public Result register(User user){
        return userService.register(user);
    }
    @ApiOperation(value = "登录" ,  notes="登录")
    @PostMapping("login")
    public Result login(User user){
        return userService.login(user);
    }
    @ApiOperation(value = "获取验证码" ,  notes="获取验证码")
    @GetMapping("getCheck")
    public Result getCheck(String email){
        return userService.getCheck(email);
    }
    @ApiOperation(value = "是否登录" ,  notes="是否登录中")
    @GetMapping("isLogin")
    public Result isLogin(Integer userID,String token){
        return userService.isLogin(userID,token);
    }
}
