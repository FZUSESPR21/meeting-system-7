package com.team.meeting.dao;

import com.team.meeting.model.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 论坛持久层
 *
 * @author Tars
 * @since 2021 -03-27 13:52:23
 */
@Repository
public interface ForumDao extends JpaRepository<Forum,Integer> {

    /**
     * 查找普通用户的关注论坛
     *
     * @param uid the uid 用户id
     * @return the list 普通用户的关注论坛列表
     */
    @Query(value = "select distinct forums.lid,forums.name,forums.roleid from forums,follows " +
            "where follows.uid = ?1 and follows.lid = forums.lid",nativeQuery = true)
    List<Forum> findOrdinaryUserFollowForums(Integer uid);

    /**
     * 查找分会主席管理的论坛
     *
     * @param roleId the role id 分会主席的roleid,与论坛对应
     * @return the list 分会主席管理的分论坛列表，正常情况只包含一个对象
     */
    @Query(value = "select * from forums where roleid = ?1",nativeQuery = true)
    List<Forum> findSubChairmanForums(Integer roleId);
}
