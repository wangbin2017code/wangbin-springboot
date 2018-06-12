package com.wangbin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbin
 * @date 2018/6/12 23:27
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello Spring Boot!";
    }
}
