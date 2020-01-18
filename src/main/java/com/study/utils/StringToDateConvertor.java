package com.study.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Authror 卫骏
 * @Date 2019/11/30 14:19
 */
public class StringToDateConvertor implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        if(source == null){
            throw new RuntimeException("请传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据格式转换错误");
        }
    }
}
