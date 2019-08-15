package com.qingxun.app.missionapi.service;

import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.generate.pojo.ViewMisJpuzUfqk;
import com.qingxun.pub.mission.ViewMisJpuzUfqkDAO;
import com.qingxun.pub.user.UserUserDAO;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ViewMisJpuzUfqkService {

    @Autowired
    ViewMisJpuzUfqkDAO ufqkDAO;

    @Autowired
    UserUserDAO userUserDAO;
    public Map<String, Object> userUpMisType(String userIdByToken, String type) {

        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer userId = userUser.getUserId();
        List<ViewMisJpuzUfqk> viewMisJpuzUfqk = ufqkDAO.userUpMisType(userId,type);




        resultMap.put("result", viewMisJpuzUfqk);
        return resultMap;
    }

    public Map<String, Object> userUpMis(String userIdByToken, String type,String id) {

        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer userId = userUser.getUserId();
        int num = ufqkDAO.userUpMis(userId,type,id);




        resultMap.put("result", num);
        return resultMap;
    }
}
