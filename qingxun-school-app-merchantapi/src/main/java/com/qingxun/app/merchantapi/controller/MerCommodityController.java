package com.qingxun.app.merchantapi.controller;

import com.qingxun.app.merchantapi.service.MerCommodityService;
import com.qingxun.app.userapi.token.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/marcos")
@RestController
public class MerCommodityController {
    @Autowired
    MerCommodityService merCommodityService;


//    @UserLoginToken
}
