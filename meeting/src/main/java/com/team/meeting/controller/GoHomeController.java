package com.team.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : ccreater
 * @ClassName : com.team.meeting.controller.GoHomeController
 * @Description : 类描述
 * @date : 2021-03-27 21:40
 * Copyright  2021 ccreater. All rights reserved.
 */
@Controller
public class GoHomeController {
    @GetMapping("/")//=> /user/test
    public String index() {
        return "redirect:/home";
    }
}
