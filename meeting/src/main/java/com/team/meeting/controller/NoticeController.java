package com.team.meeting.controller;

import com.team.meeting.model.Notice;
import com.team.meeting.model.Result;
import com.team.meeting.model.User;
import com.team.meeting.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : yangyu
 * @ClassName : com.team.meeting.controller.NoticeController
 * @Description : 类描述
 * @date : 2021-03-27 10:46:45
 * Copyright  2021 user. All rights reserved.
 */
@RestController
@RequestMapping("/notifications")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;
    User user;

    @GetMapping("list")
    public Result<List<Notice>> queryNotice(Integer forumID)
    {
        return Result.success(noticeService.queryNotice(forumID));
    }

    @GetMapping("add")
    public Result addNotice(Integer lid,String msg)
    {
        Notice notice = new Notice();
        notice.setForumID(lid);
        notice.setMessage(msg);
        notice.setUserID(1);
        int roleID = 0;
        if (user != null)
        {
            roleID = user.getRoleId();
        }
        if(roleID!=2&&(notice.getForumID()+2)!=roleID)
        {
            return Result.error(1,"该用户没有权限操作");
        }
        else if(noticeService.addNotice(notice)<=0)
        {
            return Result.error(1,"插入数据库失败");
        }
        else
        {
            return Result.success();
        }
    }

    @GetMapping("all")
    public Result<List<Notice>> allNotice()
    {
        return Result.success(noticeService.allNotice());
    }

}
