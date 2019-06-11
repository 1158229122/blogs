package com.gtcmaile.blogs.pojo.response;

/**
 * @Author: jim
 * @Date: 2019/4/19 13:58
 * @Version 1.0
 */
public enum ResultEnum {
    //100请求成功
    SUCCESS("100", "请求成功"),
    //500以上异常
    ERROR("500", "请求失败"),
    //200返回错误信息
    WAIT("200", "正在处理结果");

    private String code;

    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
