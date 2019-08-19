package com.qingxun.app.missionapi.controller;

import com.qingxun.app.missionapi.service.MissionService;
import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import com.qingxun.pub.generate.pojo.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping(value = "/mis")
@RestController
public class MissionController {

    private final
    MissionService missionService;

    private final
    TokenService tokenService = new TokenService();

    @Autowired
    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    /**
     * 用户获取所有的任务
     * 时间:2019年08月14日12:38:39
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/getMisList")
    public Map<String, Object> getMisList(HttpServletRequest httpServletRequest) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return missionService.getMisList(userIdByToken);
    }

    /**
     * 用户发布任务
     * 时间_2019年08月14日12:38:21
     *
     * @param httpServletRequest
     * @param stringObjectMap
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userAddMis")
    public Map<String, Object> userAddMis(HttpServletRequest httpServletRequest, @RequestBody Map<String, Object> stringObjectMap) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return missionService.userAddMis(userIdByToken, stringObjectMap);
    }


    /**
     * 用户查看任务详情
     * 时间:2019年08月14日12:56:45
     *
     * @param id
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/getMisById/{id}")
    public Map<String, Object> getMisById(@PathVariable int id) {
        return missionService.getMisById(id);
    }


    /**
     * 用户查看我的任务
     * 时间:2019年08月14日12:57:10
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/getMisListByUserId")
    public Map<String, Object> getMisListByUserId(HttpServletRequest httpServletRequest) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return missionService.getMisListByUserId(userIdByToken);
    }

    /**
     * 用户查看当前任务已经申请的人数
     *
     * @param httpServletRequest
     * @param jpuzId
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/getJpUzNumByJpUzId/{jpuzId}")
    public Map<String, Object> getJpUzNumByJpUzId(HttpServletRequest httpServletRequest, @PathVariable String jpuzId) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return missionService.getJpUzNumByJpUzId(jpuzId);
    }

    /**
     * 用户查看当前任务已经申请的人数
     *
     *
     * 时间:2019年08月15日10:37:12
     *
     *
     * 此处有bug
     *
     * 用户可以利用postman等等网络工具,修改他人任务信息,
     * token这能用于限制用户访问该接口,
     * 有时间的话用token获取用户的id
     * 然后判断该任务的真实主任是不是该请求的用户,
     * 记录请求的用户,  然后他的号没了:)
     *
     *
     * 解决方法
     *


     UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
     Integer userId = userUser.getUserId();

     * @param mission
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userUpMis")
    public Map<String, Object> userUpMis(@RequestBody Mission mission) {
        return missionService.userUpMis(mission);
    }


    /**
     * 获取最新的三条任务
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/getNewList")
    public Map<String, Object> getNewList() {
        return missionService.getNewList();
    }





}
