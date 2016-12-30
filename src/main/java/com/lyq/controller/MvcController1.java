package com.lyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * MVC练习
 * Created by lyq on 2016/12/5.
 */
@Controller
@RequestMapping("/test")
public class MvcController1 {

    // 十一、使用@RequestParam注解指定参数的name
    @RequestMapping("/param")
    public String testRequestParam(@RequestParam(value = "id") Integer id, @RequestParam(value = "name") String name) {
        System.out.println(id + " " + name);
        return "hello";
    }

}
