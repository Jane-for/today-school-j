package com.qingxun.app.missionapi.controller;

import com.qingxun.app.missionapi.service.MisJpuzService;
import com.qingxun.app.missionapi.service.MissionService;
import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping(value = "/jpuz")
@RestController
public class MisJpuzController {


    final
    MisJpuzService misJpuzService;

    private
    MissionService missionService;

    private final
    TokenService tokenService = new TokenService();

    @Autowired
    public MisJpuzController(MissionService missionService, MisJpuzService misJpuzService) {

        this.missionService = missionService;
        this.misJpuzService = misJpuzService;
    }


    /**
     * 用户申请任务
     * <p>
     * 时间:2019年08月14日16:15:48
     *
     * @param httpServletRequest
     * @param
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userPutMis/{MisId}")
    public Map<String, Object> userPutMis(HttpServletRequest httpServletRequest, @PathVariable String MisId) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return missionService.userPutMis(userIdByToken, MisId);
    }

    /**
     * 用户获取已经申请的任务限制状态
     *
     * @param httpServletRequest
     * @param type
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userGetMis/{type}")
    public Map<String, Object> userGetMis(HttpServletRequest httpServletRequest, @PathVariable String type) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return misJpuzService.userGetMis(userIdByToken, type);
    }

    /**
     * 用户获取所有已经申请的任务
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userGetMis")
    public Map<String, Object> userGetMis(HttpServletRequest httpServletRequest) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return misJpuzService.userGetMis(userIdByToken);
    }

    /**
     * 用户查看申请的任务详情
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userGetMisInfoById/{id}")
    public Map<String, Object> userGetMisInfoById(HttpServletRequest httpServletRequest, @PathVariable int id) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return misJpuzService.userGetMisInfoById(userIdByToken, id);
    }

    /**
     * 用户获取自己发布的全部任务
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userGetFaBuMisList")
    public Map<String, Object> userGetFaBuMisList(HttpServletRequest httpServletRequest) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return misJpuzService.userGetFaBuMisList(userIdByToken);
    }

    /**
     * 用户获取自己发布的全部任务###限制状态
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userGetFaBuMisList/{type}")
    public Map<String, Object> userGetFaBuMisList(HttpServletRequest httpServletRequest, @PathVariable String type) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return misJpuzService.userGetFaBuMisList(userIdByToken,type);
    }




}
