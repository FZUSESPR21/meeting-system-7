package com.team.meeting.model;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.model.User
 * @Description : 用户类
 * @date : 2021-03-27 17:40
 * Copyright  2021 ccreater. All rights reserved.
 */
public class User {
    private String name;
    private int roleId;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
