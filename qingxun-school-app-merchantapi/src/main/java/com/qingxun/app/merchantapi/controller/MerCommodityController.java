package com.qingxun.app.merchantapi.controller;

import com.qingxun.app.merchantapi.service.MerCommodityService;

import com.qingxun.app.userapi.token.PassToken;
import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import com.qingxun.pub.Result;
import com.qingxun.pub.generate.pojo.Commodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    Logger logger = LoggerFactory.getLogger(MerchantController.class);
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
        String openId = tokenService.getOpenId(httpServletRequest);
        return merCommodityService.get(openId);
    }

    /**
     * 用户添加商品
     * @param httpServletRequest
     * @param commodity
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userAddCom")
    public Map<String, Object> userAddCom(HttpServletRequest httpServletRequest, @RequestBody Commodity commodity) {
        logger.info(commodity.toString());
        String openId = tokenService.getOpenId(httpServletRequest);
        return merCommodityService.userAddCom(openId,commodity);
    }

    /**
     * 用户添加商品
     * @param httpServletRequest
     * @param commodity
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/userUpCom")
    public Map<String, Object> userUpCom(HttpServletRequest httpServletRequest, @RequestBody Commodity commodity) {
        logger.info(commodity.toString());

        String openId = tokenService.getOpenId(httpServletRequest);
        return merCommodityService.userUpCom(openId,commodity);
    }

    /**
     * 商户添加类型
     * @param httpServletRequest
     * @param map
     * @return
     */
    @UserLoginToken
    @PostMapping("addType")
    public Map<String, Object> addType(HttpServletRequest httpServletRequest, @RequestBody Map<String,Object> map) {
        logger.info(map.toString());
        String openId = tokenService.getOpenId(httpServletRequest);
        return merCommodityService.addType(openId,map);
    }



    /**
     * 首页
     * 用户获取最火的商品
     * @return
     */
    @PassToken
    @PostMapping(value = "/getNewCom")
    public Result getNewCom() {
        return merCommodityService.getNewCom();
    }
    /**
     * 首页
     * 用户获取店铺列表
     * @return
     */
    @PassToken
    @PostMapping(value = "/getNewMer")
    public Result getNewMer() {
        return merCommodityService.getNewMer();
    }



}

