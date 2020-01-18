package com.study.service.impl;

import com.study.common.MessageCommon;
import com.study.service.MessageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Set;

/**
 * @Authror 卫骏
 * @Date 2020/1/17 15:43
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageCommon messageCommon;

    private Logger logger = Logger.getLogger(MessageServiceImpl.class);
    @Override
    public void getVerificationCode(String phoneNum,Integer uid) throws RuntimeException{
        HashMap<String, Object> verificationCode = messageCommon.getVerificationCode(phoneNum,uid);
        if("000000".equals(verificationCode.get("statusCode"))){
            //正常返回输出data包体信息（map）
            HashMap<String,Object> data = (HashMap<String, Object>) verificationCode.get("data");
            Set<String> keySet = data.keySet();
            for(String key:keySet){
                Object object = data.get(key);
                logger.info(key +" = "+object);
            }
        }else{
            //异常返回输出错误码和错误信息
            logger.info("错误码=" + verificationCode.get("statusCode") +" 错误信息= "+verificationCode.get("statusMsg"));
            throw new RuntimeException("错误了");
        }
    }
}
