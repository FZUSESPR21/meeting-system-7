package com.team.meeting.controller;

import com.team.meeting.model.Issue;
import com.team.meeting.model.Result;
import com.team.meeting.model.User;
import com.team.meeting.service.IssueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/issues")
public class IssueController {
    @Resource
    private IssueService issueService;

    User user;

    @GetMapping
    public Result<List<Issue>> getAllIssuesByLid(@RequestParam Integer lid) {
        if (user != null) {
            return Result.success(issueService.getAllIssuesByLid(lid));
        }else {
            return Result.error(1,"用户未登录");
        }
    }
}
