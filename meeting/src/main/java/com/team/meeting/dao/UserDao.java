package com.team.meeting.dao;


import com.team.meeting.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component(value = "userDao")
public interface UserDao {
    @Select("select username,roleid from users where username = #{username} and password = MD5(#{password})")
    @Results({
            @Result(property = "name",  column = "username"),
            @Result(property = "roleId", column = "roleid")
    })
    User getOne(String username,String password);
    @Insert("INSERT INTO users(username,password) VALUES(#{username}, MD5(#{password})})")
    void insert(String username,String password);

}
