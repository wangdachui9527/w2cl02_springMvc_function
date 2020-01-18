package com.study.controller;

import com.study.entity.Account;
import com.study.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Authror 卫骏
 * @Date 2019/11/29 16:24
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping(value = "/saveAccount",method = RequestMethod.POST)
    public String getUser(Account account){
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }
}
