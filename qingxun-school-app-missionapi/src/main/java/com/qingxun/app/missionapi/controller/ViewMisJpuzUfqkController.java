package com.qingxun.app.missionapi.controller;

import com.qingxun.app.missionapi.service.ViewMisJpuzUfqkService;
import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import com.qingxun.pub.mission.ViewMisJpuzUfqkDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 处理用户申请的控制类
 * <p>
 * 时间:2019年08月15日11:04:16
 */

@RequestMapping(value = "/uar")
@RestController
public class ViewMisJpuzUfqkController {
    @Autowired
    ViewMisJpuzUfqkDAO viewMisJpuzUfqkDAO;


    @Autowired
    ViewMisJpuzUfqkService viewMisJpuzUfqkService;

    private final
    TokenService tokenService = new TokenService();

    /**
     * 用户获取其他人的任务申请
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userUpMisType/{type}")
    public Map<String, Object> userUpMisType(HttpServletRequest httpServletRequest, @PathVariable String type) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return viewMisJpuzUfqkService.userUpMisType(userIdByToken, type);
    }

    /**
     * 用户处理其他人的任务申请
     *
     * type == -1 拒绝
     *
     * type == 1 同意
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userUpMis/{type}/{id}")
    public Map<String, Object> userUpMis(HttpServletRequest httpServletRequest, @PathVariable String type, @PathVariable String id) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return viewMisJpuzUfqkService.userUpMis(userIdByToken, type,id);
    }


}
