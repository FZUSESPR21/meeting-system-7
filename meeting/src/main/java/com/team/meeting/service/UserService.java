package com.team.meeting.service;

import com.team.meeting.dao.UserDao;
import com.team.meeting.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.service.UserService
 * @Description : 类描述
 * @date : 2021-03-27 17:52
 * Copyright  2021 ccreater. All rights reserved.
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;
    public boolean register(String username, String password,int[] lids){
        try{
            userDao.insert(username,password);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public User login(String username, String password){
        try{
            User user = userDao.getOne(username,password);
            return user;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
