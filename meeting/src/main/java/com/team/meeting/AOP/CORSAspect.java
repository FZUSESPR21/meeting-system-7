package com.team.meeting.AOP;

import com.team.meeting.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.AOP.CORSAspect
 * @Description : 类描述
 * @date : 2021-03-27 21:48
 * Copyright  2021 ccreater. All rights reserved.
 */

@Aspect
@Component
public class CORSAspect {
    @Before("execution(* com.team.meeting.controller.*.*(..))")
    public void setRoleId(JoinPoint pjp){
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","GET,POST,OPTIONS,PUT");
    }

}
