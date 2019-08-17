package com.qingxun.app.merchantapi.controller;


import com.qingxun.app.merchantapi.service.MerchantService;
import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping(value = "/mer")
@RestController
public class MerchantController {

    private final
    MerchantService merchantService;

    @Autowired
    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    private final
    TokenService tokenService = new TokenService();


    /**
     * 用户申请店铺
     *
     * @param map
     * @return
     */
    @UserLoginToken
    @PostMapping("/userPutMer")
    public Map<String, Object> userPutMer(HttpServletRequest httpServletRequest, @RequestBody Map<String, Object> map) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return merchantService.userPutMer(userIdByToken, map);
    }

    /**
     * 用于判断用户有没有申请店铺
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping("/ifUserPutMer")
    public Map<String, Object> ifUserPutMer(HttpServletRequest httpServletRequest) {
        String userIdByToken = tokenService.getOpenId(httpServletRequest);
        return merchantService.ifUserPutMer(userIdByToken);
    }
    /**
     * 用户获取自己的店铺信息
     *
     * @param httpServletRequest
     * @return
     */
    @UserLoginToken
    @PostMapping("/userGetMer")
    public Map<String, Object> userGetMer(HttpServletRequest httpServletRequest) {
        String openId = tokenService.getOpenId(httpServletRequest);
        return merchantService.userGetMer(openId);
    }



}
