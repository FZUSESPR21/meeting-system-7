package com.team.meeting.service;

import com.team.meeting.dao.NoticeDao;
import com.team.meeting.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : yangyu
 * @ClassName : com.team.meeting.service.NoticeService
 * @Description : 类描述
 * @date : 2021-03-27 10:45:59
 * Copyright  2021 user. All rights reserved.
 */
@Service
public class NoticeService {

    @Autowired
    private NoticeDao noticeDao;

    //根据论坛ID查询通知
    public List<Notice> queryNotice(Integer forumID)
    {
        return noticeDao.queryNotice(forumID);
    }

    //新增通知
    public int addNotice(Notice notice)
    {
        return noticeDao.addNotice(notice);
    }

    //查询会议所有通知
    public List<Notice> allNotice()
    {
        return noticeDao.allNotice();
    }

}
