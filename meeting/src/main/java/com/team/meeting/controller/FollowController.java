package com.team.meeting.controller;

import com.team.meeting.dao.MFollowDao;
import com.team.meeting.model.MUser;
import com.team.meeting.model.Result;
import com.team.meeting.model.User;
import com.team.meeting.service.MFollowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/follows")
public class FollowController {
    @Resource
    private MFollowService service;
    User user;

    @GetMapping("/users")
    public Result<List<MUser>> getAllUserByLid(@RequestParam Integer lid) {
        if (user != null) {
            return Result.success(service.findAllUsersByLid(lid));
        }else {
            return Result.error(1,"用户未登录");
        }
    }

    @GetMapping("/count")
    public Result<Integer> getCountDistinctByLid(@RequestParam Integer lid) {
        if (user != null) {
            return Result.success(service.countUserByLid(lid));
        }else {
            return Result.error(1,"用户未登录");
        }
    }
}
