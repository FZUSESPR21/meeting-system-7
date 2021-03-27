package com.team.meeting.dao;

import com.team.meeting.model.Notice;

import java.util.List;

/**
 * @author : yangyu
 * @ClassName : com.team.meeting.dao.NoticeDao
 * @Description : 类描述
 * @date : 2021-03-27 10:44:53
 * Copyright  2021 user. All rights reserved.
 */
public interface NoticeDao {
    int addNotice(Notice notice);
    List<Notice> queryNotice(Integer forumID);
    List<Notice> allNotice();
}
