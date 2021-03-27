package com.team.meeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yangyu
 * @ClassName : com.team.meeting.controller.TestController
 * @Description : 类描述
 * @date : 2021-03-27 10:46:57
 * Copyright  2021 user. All rights reserved.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello")
    public String hello()
    {
        return "hello";
    }
}
