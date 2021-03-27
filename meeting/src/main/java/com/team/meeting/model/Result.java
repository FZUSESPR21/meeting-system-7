package com.team.meeting.model;

import java.util.List;

/**
 * @author : yangyu
 * @ClassName : com.team.meeting.model.Result
 * @Description : 类描述
 * @date : 2021-03-27 10:54:57
 * Copyright  2021 user. All rights reserved.
 */
public class Result {
    private int code;
    private List<Object> data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
