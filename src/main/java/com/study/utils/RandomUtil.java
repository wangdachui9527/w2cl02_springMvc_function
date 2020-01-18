package com.study.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Authror 卫骏
 * @Date 2020/1/18 9:22
 */
@Component
public class RandomUtil {

    /**
     * 随机生成4位数字
     * @return
     */
    public static String getFourNum(){
        String str = "0123456789";
        StringBuilder sb = new StringBuilder(4);
        for(int i = 0 ; i < 4 ; i++){
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        return sb.toString();
    }
}
