package com.lyq.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 十四、异常的处理
 * 2.处理全局异常（所有Controller）
 * Created by lyq on 2016/12/6.
 */
@ControllerAdvice
public class TestControllerAdvice {

    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex) {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        System.out.println("in TestControllerAdvice");
        return mv;
    }

}
