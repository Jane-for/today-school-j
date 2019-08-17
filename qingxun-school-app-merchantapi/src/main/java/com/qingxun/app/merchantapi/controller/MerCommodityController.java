package com.qingxun.app.merchantapi.controller;

import com.qingxun.app.merchantapi.service.MerCommodityService;

import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping(value = "/marcos")
@RestController
public class MerCommodityController {
    private final
    MerCommodityService merCommodityService;


    private final
    TokenService tokenService = new TokenService();


    @Autowired
    public MerCommodityController(MerCommodityService merCommodityService) {
        this.merCommodityService = merCommodityService;
    }

    /**
     * 商家获取自己的商品
     *
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/get")
    public Map<String, Object> get(HttpServletRequest httpServletRequest) {
        String openId = tokenService.getOpenId(httpServletRequest);
        return merCommodityService.get(openId);
    }

    /**
     * 商家获取自己的类别一
     *
     * @return
     */
    @UserLoginToken
    @PostMapping("/getType1")
    public Map<String, Object> getType1(HttpServletRequest httpServletRequest) {
        String openId = tokenService.getOpenId(httpServletRequest);
        return merCommodityService.getType1(openId);
    }

    /**
     * 商家获取自己的类别二
     *
     *
     *
     * 时间:2019年08月17日15:18:41
     * 暂时只有一个类型,原因很简单,懒
     *
     * @return
     */
    @UserLoginToken
    @PostMapping("/getType2")
    public Map<String, Object> getType2(HttpServletRequest httpServletRequest) {
        String openId = tokenService.getUserToken(httpServletRequest);
        return merCommodityService.get(openId);
    }

}

