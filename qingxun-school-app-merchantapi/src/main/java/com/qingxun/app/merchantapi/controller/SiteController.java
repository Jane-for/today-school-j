package com.qingxun.app.merchantapi.controller;

import com.qingxun.app.merchantapi.service.SiteService;
import com.qingxun.app.userapi.token.TokenService;
import com.qingxun.app.userapi.token.UserLoginToken;
import com.qingxun.pub.generate.pojo.UserUserOth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping(value = "/site")
@RestController
public class SiteController {

    private final
    SiteService siteService;

    private TokenService tokenService  = new TokenService();

    private Logger logger = LoggerFactory.getLogger(SiteController.class);

    @Autowired
    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    @UserLoginToken
    @PostMapping("/get")
    public Map<String, Object> get(HttpServletRequest httpServletRequest) {
        String openId = tokenService.getOpenId(httpServletRequest);
        return siteService.get(openId);

    }

    @UserLoginToken
    @PostMapping(value = "/userAddSite")
    public Map<String, Object> userAddSite(HttpServletRequest httpServletRequest, @RequestBody UserUserOth userUserOth) {
        String openId = tokenService.getOpenId(httpServletRequest);
        logger.info("userUserOth.getOthPhone()###",userUserOth.getOthPhone());
        return siteService.userAddSite(openId,userUserOth);

    }
}
