package com.team.meeting.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.util.AppUtil
 * @Description : 类描述
 * @date : 2021-03-27 18:41
 * Copyright  2021 ccreater. All rights reserved.
 */
@Component
public class AppUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        applicationContext = arg0;
    }

    public static Object getBean(String name) {
        Object object = null;
        object = applicationContext.getBean(name);
        return object;
    }
}