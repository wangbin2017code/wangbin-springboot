package com.wangbin.controller;

import com.wangbin.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbin
 * @date 2018/6/12 23:27
 */
@Controller
public class HelloController {

    @Value("${sport}")
    private String sport;

    @Value("${age}")
    private int age;

    @Value("${content}")
    private String content;

    @Autowired
    private Student student;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHello(){
        return "index";
    }
}
