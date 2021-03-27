package com.team.meeting.service;

import com.team.meeting.dao.ForumDao;
import com.team.meeting.model.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    public List<Forum> findForumsByUidAndRoleId(Integer uid,Integer roleid) {
        List<Forum> forums = new ArrayList<>();
        if(roleid == 0){
            forums = forumDao.findOrdinaryUserFollowForums(uid);
        }else if (roleid == 1 || roleid == 2) {
            forums = forumDao.findAll();
        }else if (roleid > 2) {
            forums = forumDao.findSubChairmanForums(roleid);
        }
        return forums;
    }

}
