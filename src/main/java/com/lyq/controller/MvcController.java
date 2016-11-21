package com.lyq.controller;

import com.lyq.model.Person;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

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

    //match automatically
    @RequestMapping("/person")
    public String toPerson(String name, double age) {
        System.out.println(name + " " + age);
        return "hello";
    }

    //boxing automatically
    @RequestMapping("/person1")
    public String toPerson(Person p) {
        System.out.println(p.getName() + " " + p.getAge());
        return "hello";
    }

    //    六、使用InitBinder来处理Date类型的参数
    //the parameter was converted in initBinder
    @RequestMapping("/date")
    public String date(Date date) {
        System.out.println(date);
        return "hello";
    }

    //At the time of initialization,convert the type "String" to type "date"
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }

    //    七、向前台传递参数
    //pass the parameters to front-end
    @RequestMapping("/show")
    public String showPerson(Map<String, Object> map) {
        Person p = new Person();
        map.put("p", p);
        p.setAge(20);
        p.setName("jayjay");
        return "show";
    }

}
