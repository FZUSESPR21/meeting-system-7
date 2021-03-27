package com.team.meeting.service;

import com.team.meeting.dao.MFollowDao;
import com.team.meeting.model.MUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MFollowService {
    @Resource
    private MFollowDao mFollowDao;

    public List<MUser> findAllUsersByLid(Integer lid) {
        List<MUser> mUsers = mFollowDao.findAllMUserByLid(lid);
        for (MUser mUser : mUsers) {
            mUser.setPassword("");
        }
        return mUsers;
    }

    public Integer countUserByLid(Integer lid) {
        return mFollowDao.countDistinctUidByLid(lid);
    }
}
