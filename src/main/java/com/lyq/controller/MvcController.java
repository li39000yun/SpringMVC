package com.lyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC Controller Test
 * Created by lyq on 2016/11/20.
 */
@Controller
@RequestMapping("/mvc")
public class MvcController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
