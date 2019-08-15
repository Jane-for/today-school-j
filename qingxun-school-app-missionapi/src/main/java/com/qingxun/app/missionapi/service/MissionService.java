package com.qingxun.app.missionapi.service;

import com.qingxun.pub.generate.dao.MissionMapper;
import com.qingxun.pub.generate.pojo.Mission;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.generate.pojo.ViewMisAll;
import com.qingxun.pub.mission.MissionDAO;
import com.qingxun.pub.mission.MissionJpuzDAO;
import com.qingxun.pub.mission.ViewAllMisDAO;
import com.qingxun.pub.user.UserUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
public class MissionService {
    private final
    MissionDAO missionDAO;
    private final
    MissionMapper missionMapper;

    private final
    UserUserDAO userUserDAO;

    final
    MissionJpuzDAO missionJpuzDAO;

    private final
    ViewAllMisDAO viewAllMisDAO;

    @Autowired
    public MissionService(MissionDAO missionDAO, MissionMapper missionMapper, UserUserDAO userUserDAO, ViewAllMisDAO viewAllMisDAO, MissionJpuzDAO missionJpuzDAO) {
        this.missionDAO = missionDAO;
        this.missionMapper = missionMapper;
        this.userUserDAO = userUserDAO;

        this.viewAllMisDAO = viewAllMisDAO;
        this.missionJpuzDAO = missionJpuzDAO;
    }

    public Map<String, Object> getMisList(String userIdByToken) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        try {
            List<ViewMisAll> allMis = viewAllMisDAO.getAllMis();

            List<ViewMisAll> viewAllMis = new ArrayList<>();
            for (ViewMisAll allMi : allMis) {
                String misContent = allMi.getMisContent();
                String substring = misContent.substring(0, 5) + "...";
                allMi.setMisContent(substring);
                viewAllMis.add(allMi);
            }
            resultMap.put("result", viewAllMis);

        } catch (Exception e) {
            System.err.println("com.qingxun.app.userapi.service.UserUserService###" + e.toString());
            resultMap.put("result", "程序异常");
        }
        return resultMap;

    }

    public Map<String, Object> userAddMis(String userIdByToken, Map<String, Object> stringObjectMap) {


        Map<String, Object> stringObjectLinkedHashMap = new LinkedHashMap<>();
        stringObjectLinkedHashMap.put("reason", "请求成功");
        stringObjectLinkedHashMap.put("resultcode", 200);

        try {

//            {
//								'title': that.title,
//								'content': that.content,
//								'zuqqNum': that.zuqqNum,
//								'money': that.money,
//								'jiui': '0',
//								'time1':that.dateTime1,
//								'time2':that.dateTime2
//							}

            System.out.println(stringObjectMap.toString());

            String title = stringObjectMap.get("title").toString();
            String content = stringObjectMap.get("content").toString();
            int zuqqNum = Integer.parseInt(stringObjectMap.get("zuqqNum").toString());
            float money = Float.parseFloat(stringObjectMap.get("money").toString());
            int jiui = Integer.parseInt(stringObjectMap.get("jiui").toString());

            UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
            int maxId = missionDAO.getMax_id() + 1;
            int maxId2 = missionDAO.getMaxMisid() + 1;
            int maxJpuzid = missionDAO.getMaxJpuzid() + 1;
            Mission mission = new Mission();
            mission.setId(maxId);
            mission.setMisId(maxId2);
            mission.setJpuzId(maxJpuzid);
            if (jiui == 0) {
                String time1 = (String) stringObjectMap.get("time1");
                String time2 = (String) stringObjectMap.get("time2");
                String time = time1 + "至" + time2;
                mission.setMisTime1(time);

            } else {
                Date date = new Date();
                Timestamp timestamp = new Timestamp(date.getTime());
                mission.setMisTime2(timestamp.toString());

            }
            mission.setMisTilte(title);
            mission.setMisXuqqnum(zuqqNum);
            mission.setMisMoney(money);
            mission.setMisContent(content);
            mission.setFaqiId(userUser.getUserId());
            mission.setMisStruts(1);
            int i = missionMapper.insertSelective(mission);
            stringObjectLinkedHashMap.put("result", i);

        } catch (Exception e) {
            System.err.println("com.qingxun.app.userapi.service.UserUserService###" + e.toString());
            stringObjectLinkedHashMap.put("result", "程序异常");
        }
        return stringObjectLinkedHashMap;

    }

    public Map<String, Object> getMisById(int id) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        try {
            Mission mission = missionDAO.getMisByMisId(id);
            resultMap.put("result", mission);

        } catch (Exception e) {
            resultMap.put("result", "程序异常");
        }
        return resultMap;

    }

    public Map<String, Object> getMisListByUserId(String userIdByToken) {


        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);


        try {
            UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
            Integer userId = userUser.getUserId();
            List<Mission> misLisyByUserId = missionDAO.getMisLisyByUserId(userId);
            resultMap.put("result", misLisyByUserId);

        } catch (Exception e) {
            resultMap.put("result", "程序异常");
        }
        return resultMap;
    }

    /**
     * 获取当前任务已经申请的人数
     *
     * @param jpuzId
     * @return
     */
    public Map<String, Object> getJpUzNumByJpUzId(String jpuzId) {


        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        try {
            int userUser = missionDAO.getJpUzNumByJpUzId(jpuzId);
            resultMap.put("result", userUser);
        } catch (Exception e) {
            resultMap.put("result", "程序异常");
        }
        return resultMap;
    }

    public Map<String, Object> userPutMis(String userIdByToken, String misId) {

        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        try {
            UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
            Integer userId = userUser.getUserId();
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());
            int insNum = missionDAO.userPutMis(userId, misId, timestamp.toString().substring(0, 19), "0");
            resultMap.put("result", insNum);
        } catch (Exception e) {
            resultMap.put("resultr", "程序异常");
        }
        return resultMap;
    }


    public Map<String, Object> userGetMis(String userIdByToken, String type) {
        return null;
    }

    public Map<String, Object> userUpMis(String userIdByToken, String jpuzId) {
        return null;
    }

    public Map<String, Object> userUpMis(Mission mission) {

        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        int i = missionMapper.updateByPrimaryKey(mission);


        resultMap.put("result", i);
        return resultMap;
    }
}
