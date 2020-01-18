package com.study.controller;

import com.study.service.MessageService;
import com.study.utils.RedisUtilPlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Authror 卫骏
 * @Date 2020/1/17 15:38
 */
@Controller
public class MessageController {

    @Autowired
    private RedisUtilPlus redisUtilPlus;

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/getMessage",method = RequestMethod.POST)
    public String getMessage(String phoneNum,Integer uid){
        try {
            messageService.getVerificationCode(phoneNum,uid);
        } catch (RuntimeException e) {
            return "fail";
        }
        return "success";
    }

    @RequestMapping(value = "/doVerification",method = RequestMethod.POST)
    public String doVerification(String verificationCode,Integer uid){
        //拿用户输入的验证码和缓存中的验证码进行对比
        String key = (String)redisUtilPlus.get(uid + "");
        if(verificationCode.equals(key)){
            return "success2";
        }
        return "fail";
    }
}
