package com.study.common;

import com.cloopen.rest.sdk.BodyType;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import com.study.utils.RandomUtil;
import com.study.utils.RedisUtilPlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Set;

/**
 * @Authror 卫骏
 * @Date 2020/1/17 15:41
 */
@Component
public class MessageCommon {

    @Autowired
    private RedisUtilPlus redisUtilPlus;

    public HashMap<String,Object> getVerificationCode(String phoneNum,Integer uid){
        //获取随机4位验证码
        String fourNum = RandomUtil.getFourNum();
        //验证码存入缓存
        redisUtilPlus.set(uid + "",fourNum,60L);
        String serverIp = "app.cloopen.com";
        //请求端口
        String serverPort = "8883";
        //主账号,登陆云通讯网站后,可在控制台首页看到开发者主账号ACCOUNT SID和主账号令牌AUTH TOKEN
        String accountSId = "8a216da86f17653b016f56205c862a47";
        String accountToken = "89904b5e50344b329ca5cc379f34d275";
        //请使用管理控制台中已创建应用的APPID
        String appId = "8a216da86f17653b016f56205cea2a4d";
        CCPRestSmsSDK sdk = new CCPRestSmsSDK();
        sdk.init(serverIp, serverPort);
        sdk.setAccount(accountSId, accountToken);
        sdk.setAppId(appId);
        sdk.setBodyType(BodyType.Type_JSON);
        String templateId= "1";
        String[] datas = {fourNum,"1","变量3"};
        HashMap<String, Object> result = sdk.sendTemplateSMS(phoneNum,templateId,datas);
        return result;
    }
}
