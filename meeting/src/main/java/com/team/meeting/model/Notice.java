package com.team.meeting.model;

import java.text.SimpleDateFormat;


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
    private String times ;

    public Notice()
    {
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        times = tempDate.format(new java.util.Date());
    }

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
