package com.qingxun.app.userapi.controller;

import com.qingxun.app.userapi.service.UserUserService;
import com.qingxun.app.userapi.token.PassToken;
import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping(value = "/login")
@RestController
public class UserUserController {


    private final
    UserUserService userUserService;

    private final
    TokenService tokenService;

    @Autowired
    public UserUserController(TokenService tokenService, UserUserService userUserService) {
        this.tokenService = tokenService;
        this.userUserService = userUserService;
    }


    /**
     * 获取token
     * @param map
     * @return
     */
    @PassToken
    @PostMapping(value = "/getToken")
    public Map<String, Object> getToken(@RequestBody Map<String, Object> map) {
        return userUserService.getToken(map);
    }

    /**
     * 添加用户信息
     * @param map
     * @return
     */
    @PassToken
    @PostMapping(value = "/addInfo")
    public Map<String, Object> addInfo(@RequestBody Map<String, Object> map) {
        return userUserService.addInfo(map);
    }


    @UserLoginToken
    @PostMapping("/getInfo")
    public Map<String, Object> getInfo(HttpServletRequest httpServletRequest) {

        String userIdByToken = tokenService.getUserIdByToken(httpServletRequest);

        return userUserService.getInfo(userIdByToken);
    }


}
