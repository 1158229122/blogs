package com.gtcmaile.blogs.pojo.response;

import com.getmaile.blogs.constant.Error;

/**
 * @Author: jim
 * @Date: 2019/4/19 13:57
 * @Version 1.0
 */
public class Result<T> {

    /**
     * 错误码
     */
    public String code;

    /**
     * 提示信息
     */
    public String msg;

    /**
     * 具体的内容
     */
    public T data;

    /**
     * 成功时候的调用
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public Result() {
    }
    public static Result autoResult(Integer i){
        if(i!=null&&i>0){
            return Result.success(null);
        }else{
            return Result.build(Error.DEFAULT_ERROR,"操作失败!");
        }
    }
    /**
     * 根据返回的状态对象， 构建返回结果
     * @param resultEnum
     * @param <T>
     * @return
     */
    public static <T> Result<T> build(ResultEnum resultEnum) {
        return new Result<T>(resultEnum);
    }

    /**
     * 根据 code， 和  msg 构建返回结果
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> build(String code, String msg) {
        return new Result<T>(code, msg);
    }

    /**
     * 根据 code， 和  msg, 和 data 构建返回结果
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> build(String code, String msg, T data) {
        return new Result<T>(code, msg, data);
    }

    /**
     * 失败的调用
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(String codeMsg) {
        return new Result<>(codeMsg);
    }

    /**
     * 失败的调用 将返回结果传入
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(T data) {
        return new Result<T>(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMsg(), data);
    }

    public Result(T data) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.msg = ResultEnum.SUCCESS.getMsg();
        this.data = data;
    }

    public Result(String msg) {
        this.code = ResultEnum.ERROR.getCode();
        this.data = null;
        this.msg = msg;
    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}