package com.team.meeting.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component(value = "followDao")
public interface FollowDao {
    @Insert("INSERT INTO follows(uid,lid) VALUES(#{uid}, #{lid})")
    void insert(int uid,int lid);
    @Select("select lid from follows where uid = #{uid}")
    int[] getAll(int uid);
}
