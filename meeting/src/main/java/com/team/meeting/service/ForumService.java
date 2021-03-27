package com.team.meeting.service;

import com.team.meeting.dao.ForumDao;
import com.team.meeting.model.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForumService {
    @Resource
    private ForumDao forumDao;

    public List<Forum> findOrdinaryUserFollowForums(Integer uid) {
        return forumDao.findOrdinaryUserFollowForums(uid);
    }

    public List<Forum> findAllForums() {
        return forumDao.findAll();
    }

    public List<Forum> findSubChairmanForums(Integer roleId) {
        return forumDao.findSubChairmanForums(roleId);
    }

}
