package com.team.meeting.dao;

import com.team.meeting.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueDao extends JpaRepository<Issue,Integer> {

    @Query(value = "select * from issues where lid = ?1",nativeQuery = true)
    List<Issue> findAllByLid(Integer lid);
}
