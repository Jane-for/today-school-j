package com.qingxun.app.userapi.service;


import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.pub.generate.dao.UserUserMapper;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.user.UserUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class UserUserService {

    private final
    TokenService tokenService;

    private final
    UserUserDAO userUserDAO;


    private final
    UserUserMapper userUserMapper;

    @Autowired
    public UserUserService(TokenService tokenService, UserUserDAO userUserDAO, UserUserMapper userUserMapper) {
        this.tokenService = tokenService;
        this.userUserDAO = userUserDAO;
        this.userUserMapper = userUserMapper;
    }

    public Map<String, Object> getToken(Map<String, Object> map) {


        Map<String, Object> stringObjectMap = new LinkedHashMap<>();
        stringObjectMap.put("reason", "请求成功");
        stringObjectMap.put("resultcode", 200);

        try {
            String one = (String) map.get("one");
            String twe = (String) map.get("one1");
            UserUser userUser = new UserUser();
            userUser.setUserOpenid(one);
            userUser.setUserImgurl(twe);
            String token = tokenService.getToken(userUser);
            Map<String, Object> stringObjectMap1 = new LinkedHashMap<>();
            stringObjectMap1.put("token", token);
            stringObjectMap.put("result", stringObjectMap1);
        } catch (Exception e) {
            System.err.println("com.qingxun.app.userapi.service.UserUserService###" + e.toString());
            stringObjectMap.put("result", "程序异常");
        }
        return stringObjectMap;
    }

    public Map<String, Object> addInfo(Map<String, Object> map) {


        Map<String, Object> stringObjectMap = new LinkedHashMap<>();
        stringObjectMap.put("reason", "请求成功");
        stringObjectMap.put("resultcode", 200);

        try {
            int userId = userUserDAO.getMaxId() + 1;
            int _id = userUserDAO.getMax_Id() + 1;
            String openid = (String) map.get("openid");
            String imgUrl = (String) map.get("imgUrl");

            UserUser userUser1 = userUserDAO.selectByOpenid(openid);
            if (userUser1 == null) {
                UserUser userUser = new UserUser();
                userUser.setUserId(_id);
                userUser.setUserId(userId);
                userUser.setUserImgurl(imgUrl);
                userUser.setUserOpenid(openid);
                int i = userUserDAO.insert(userUser);
                stringObjectMap.put("result", i);
            } else {

                int num = userUserDAO.updateByOpenid(imgUrl, openid);
                stringObjectMap.put("result", "已更新用户信息,#" + num);
            }

        } catch (Exception e) {
            System.err.println("com.qingxun.app.userapi.service.UserUserService###" + e.toString());
            stringObjectMap.put("result", "程序异常");
        }
        return stringObjectMap;

    }

    public Map<String, Object> getInfo(String userIdByToken) {


        Map<String, Object> stringObjectMap = new LinkedHashMap<>();
        stringObjectMap.put("reason", "请求成功");
        stringObjectMap.put("resultcode", 200);

        try {
            UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
            System.out.println(userUser.getUserMoney());
            stringObjectMap.put("result", userUser);

        } catch (Exception e) {
            System.err.println("com.qingxun.app.userapi.service.UserUserService###" + e.toString());
            stringObjectMap.put("result", "程序异常");
        }
        return stringObjectMap;

    }
}
