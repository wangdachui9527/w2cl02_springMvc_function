package com.study.service;

/**
 * @Authror 卫骏
 * @Date 2020/1/17 15:43
 */
public interface MessageService {
    void getVerificationCode(String phoneNum,Integer uid)throws RuntimeException;
}
