package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Authror 卫骏
 * @Date 2019/11/29 14:59
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello springmvc!");
        return "success";
    }
}
