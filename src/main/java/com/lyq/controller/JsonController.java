package com.lyq.controller;

import com.lyq.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 十三、返回json格式的字符串
 * Created by lyq on 2016/12/6.
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    @ResponseBody
    @RequestMapping("/user")
    public User getUser() {
        User u = new User();
        u.setName("张三");
        u.setId(100);
        return u;
    }

    //    十四、异常的处理
    //    1.处理局部异常（Controller内）
    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex) {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        System.out.println("in testExceptionHandler");
        return mv;
    }

    @RequestMapping("/error")
    public String error() {
        int i = 5 / 0;
        return "hello";
    }

}
