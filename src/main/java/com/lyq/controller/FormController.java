package com.lyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

/**
 * 十六、表单的验证（使用Hibernate-validate）及国际化
 * Created by lyq on 2016/12/6.
 */
@Controller
@RequestMapping("/form")
public class FormController {

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String add(@Valid DemoUser demoUser, BindingResult bindingResult) {
//        if (bindingResult.getErrorCount() > 0) {
//            return "addUser";
//        }
//        return "showUser";
//    }
//
//    public String add(Map<String, Object> map) {
//        map.put("user", new DemoUser());
//        return "addUser";
//    }

}
