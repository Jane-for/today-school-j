package com.qingxun.app.missionapi.service;

import com.qingxun.pub.generate.pojo.Mission;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.generate.pojo.ViewMisAll;
import com.qingxun.pub.generate.pojo.ViewMisJpuzUser;
import com.qingxun.pub.mission.MissionDAO;
import com.qingxun.pub.mission.MissionJpuzDAO;
import com.qingxun.pub.mission.ViewMisJpuzUserDAO;
import com.qingxun.pub.user.UserUserDAO;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service
public class MisJpuzService {

    private final ViewMisJpuzUserDAO viewMisJpuzUserDAO;

    private final
    UserUserDAO userUserDAO;


    private final
    MissionDAO missionDAO;

    @Autowired
    public MisJpuzService(ViewMisJpuzUserDAO viewMisJpuzUserDAO, UserUserDAO userUserDAO, MissionDAO missionDAO) {
        this.viewMisJpuzUserDAO = viewMisJpuzUserDAO;
        this.userUserDAO = userUserDAO;
        this.missionDAO = missionDAO;
    }

    public Map<String, Object> userGetMis(String userIdByToken, String type) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer userId = userUser.getUserId();
        List<ViewMisJpuzUser> insNum = viewMisJpuzUserDAO.userGetMis(userId,type);
        resultMap.put("result", insNum);
        return resultMap;
    }

    public Map<String, Object> userGetMis(String userIdByToken) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer userId = userUser.getUserId();
        List<ViewMisJpuzUser> insNum = viewMisJpuzUserDAO.userGetMisList(userId);
        resultMap.put("result", insNum);
        return resultMap;
    }

    public Map<String, Object> userGetMisInfoById(String idByToken, int id) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(idByToken);
        Integer userId = userUser.getUserId();
        ViewMisJpuzUser viewMisJpuzUser = viewMisJpuzUserDAO.userGetMisInfoById(userId);
        resultMap.put("result", viewMisJpuzUser);
        return resultMap;
    }

    public Map<String, Object> userGetFaBuMisList(String userIdByToken) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer userId = userUser.getUserId();
        List<Mission> missionList = missionDAO.userGetFaBuMisList(userId);
        resultMap.put("result", missionList);
        return resultMap;
    }

    public Map<String, Object> userGetFaBuMisList(String userIdByToken, String type) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer userId = userUser.getUserId();
        List<Mission> missionList = missionDAO.userGetFaBuMisListType(userId,type);
        resultMap.put("result", missionList);
        return resultMap;
    }
}
