package com.team.meeting.model;

import java.util.List;

/**
 * @author : yangyu
 * @ClassName : com.team.meeting.model.Result
 * @Description : 类描述
 * @date : 2021-03-27 10:54:57
 * Copyright  2021 user. All rights reserved.
 */
public class Result<T> {
    private int code;
    private T data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public static Result success() {
        Result result = new Result<>();
        result.setCode(0);
        result.setMessage("成功");
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>(data);
        result.setCode(0);
        result.setMessage("成功");
        return result;
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
