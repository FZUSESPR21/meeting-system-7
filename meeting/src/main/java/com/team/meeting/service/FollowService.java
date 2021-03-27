package com.team.meeting.service;

import com.team.meeting.dao.FollowDao;
import com.team.meeting.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.service.FollowService
 * @Description : 类描述
 * @date : 2021-03-27 19:18
 * Copyright  2021 ccreater. All rights reserved.
 */
@Component
public class FollowService {
    @Autowired
    private FollowDao followDao;
    public boolean insertFollows(int uid, int [] lids){
        for(int lid : lids){
            try{
                followDao.insert(uid,lid);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return true;
    }
    public int[] getFollows(int uid){
        return followDao.getAll(uid);
    }
}
