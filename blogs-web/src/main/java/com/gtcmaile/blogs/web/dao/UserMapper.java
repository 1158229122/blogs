package com.gtcmaile.blogs.web.dao;

import java.util.List;

import com.gtcmaile.blogs.pojo.User;
import com.gtcmaile.blogs.pojo.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    @Select("SELECT * FROM user WHERE phone = #{phone}")
    User getUserByPhone(@Param("phone") String phone);
    @Select("SELECT * FROM user WHERE email = #{email}")
    User getUserByEmail(@Param("email") String email);
    /**
     * 根据手机号码或则邮箱或用户名进行登录
     * @param user
     * @return
     */
    User login(User user);
}