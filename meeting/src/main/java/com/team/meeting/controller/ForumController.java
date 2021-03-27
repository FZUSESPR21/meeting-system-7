package com.team.meeting.controller;

import com.team.meeting.model.Forum;
import com.team.meeting.model.Result;
import com.team.meeting.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 控制层
 *
 * @author Tars
 * @since 2021 -03-27 13:28:36
 */
@RestController
@RequestMapping("/forums")
public class ForumController {

    Integer uid;
    Integer roleid;

    @Resource
    private ForumService forumService;

//    @GetMapping("/list")
//    public Result<List<Forum>> findRelatedForums() {
//        return
//    }
}
