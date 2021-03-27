package com.team.meeting.AOP;

import com.team.meeting.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.AOP.AuthAspect
 * @Description : 类描述
 * @date : 2021-03-27 19:49
 * Copyright  2021 ccreater. All rights reserved.
 */
@Aspect
@Component
public class AuthAspect {
    @Autowired
    private HttpSession session;
    @Around("execution(* com.team.meeting.controller.*.*(..))")
    public void setRoleId(JoinPoint pjp){
        Object obj = pjp.getTarget();
        Class clazz=obj.getClass();
        try {
            Field f=clazz.getDeclaredField("user");
            f.setAccessible(true);
            User user=(User)session.getAttribute("user");
            f.set(obj, user);

        } catch (NoSuchFieldException | IllegalAccessException e) {}
    }

}
