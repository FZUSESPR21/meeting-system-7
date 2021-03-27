package com.team.meeting.dao;

import com.team.meeting.model.MUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MFollowDao extends JpaRepository<MUser,Integer> {
    @Query(value = "select users.id,users.userName,users.password,users.roleid " +
            "from users,follows where follows.lid = ?1 and follows.uid = users.id",nativeQuery = true)
    List<MUser> findAllMUserByLid(Integer lid);


    @Query(value = "select count(distinct uid) from follows where lid = ?1",nativeQuery = true)
    Integer countDistinctUidByLid(Integer lid);
}
