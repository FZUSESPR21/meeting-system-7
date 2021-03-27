package com.team.meeting.model;

/**
 * @author : yangyu
 * @ClassName : com.team.meeting.model.Notice
 * @Description : 类描述
 * @date : 2021-03-27 11:04:34
 * Copyright  2021 user. All rights reserved.
 */
public class Notice {
    private Integer id;
    private Integer forumID;
    private String message;
    private Integer userID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForumID() {
        return forumID;
    }

    public void setForumID(Integer forumID) {
        this.forumID = forumID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
