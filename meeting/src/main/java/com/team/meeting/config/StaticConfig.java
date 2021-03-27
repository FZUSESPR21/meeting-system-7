package com.team.meeting.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.config.StaticConfig
 * @Description : 类描述
 * @date : 2021-03-27 21:30
 * Copyright  2021 ccreater. All rights reserved.
 */

@Configuration
@PropertySource("application.yml")
public class StaticConfig implements WebMvcConfigurer {
    @Value("${develop.frontendPath}")
    private String frontendPath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/home/**").addResourceLocations(frontendPath);
    }
}