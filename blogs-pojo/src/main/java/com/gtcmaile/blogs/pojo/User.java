package com.gtcmaile.blogs.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
    private Integer id;

    private String phone;

    private String password;

    private String nickname;

    private String headurl;

    private Integer age;

    private String sex;

    private String province;

    private String city;

    private Integer expscore;

    private Date registertime;

    private String qq;

    private String weibo;

    private String wechat;

    private String miniprogram;

    private Integer bloggold;

    private Integer staus;

    private String permission;

    private Double longitude;

    private Double latitude;

    private String locationaddress;

    private String token;

    private String macaddress;

    private Date logintime;

    private Date birthday;

    private String idcardno;

    private String truename;

    private Integer ranktype;

    private String rankname;

    private Integer level;

    private String platform;

    private String phonetype;

    private String systemversion;

    private String uniqueid;

    private String appversion;

    private Date updatetime;

    private Integer speaking;

    private String email;

    private static final long serialVersionUID = 1L;
}