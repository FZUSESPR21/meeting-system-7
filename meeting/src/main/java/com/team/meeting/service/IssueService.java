package com.team.meeting.service;

import com.team.meeting.dao.IssueDao;
import com.team.meeting.model.Issue;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IssueService {
    @Resource
    private IssueDao issueDao;

    public List<Issue> getAllIssuesByLid(Integer lid) {
        return issueDao.findAllByLid(lid);
    }
}
