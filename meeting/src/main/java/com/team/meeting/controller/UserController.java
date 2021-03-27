package com.team.meeting.controller;

import com.team.meeting.model.Result;
import com.team.meeting.model.User;
import com.team.meeting.service.FollowService;
import com.team.meeting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.controller.UserController
 * @Description : 类描述
 * @date : 2021-03-27 18:04
 * Copyright  2021 ccreater. All rights reserved.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private FollowService followService;
    @RequestMapping(path = "/login",method=RequestMethod.POST)
    public Result<Follows> login(@RequestParam String username, @RequestParam String password, HttpSession session){
       User user = userService.login(username,password);
       if(user == null){
           return Result.error(1,"账号或密码错误");
       }else{
           session.setAttribute("user",user);
       }

       int lids [] = followService.getFollows(user.getId());
       return Result.success(new Follows(lids));
    }
    @RequestMapping(path = "/register",method=RequestMethod.POST)
    public Result<Follows> register(@RequestParam String username,@RequestParam String password,@RequestParam(value="lid[]") int[] lids){
        username = username.trim();
        if (username == "") {
            return Result.error(1,"用户名不能为空");
        }
        if (password == "") {
            return Result.error(1,"密码不能为空");
        }
        Boolean result = userService.register(username,password,lids);
        if(result){
            User user = userService.login(username,password);
            if(user == null){
                result = false;
            }else{
                result = followService.insertFollows(user.getId(),lids);
            }
        }


        if(result){
            return Result.success(new Follows(lids));
        }else{
            return Result.error(1,"未知错误请联系管理员");
        }

    }

}
class Follows{
    private int[] lids;
    public Follows(int [] lids){
        this.lids = lids;
    }

    public void setLid(int[] lid) {
        this.lids = lid;
    }

    public int[] getLid() {
        return lids;
    }
}
