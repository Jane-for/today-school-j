package com.qingxun.app.merchantapi.controller;

import com.qingxun.app.merchantapi.service.MerchantService;
import com.qingxun.app.userapi.token.UserLoginToken;
import com.qingxun.pub.generate.pojo.UserMerchant;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @UserLoginToken
    @PostMapping("/userPutMer")
    public Map<String, Object> userPutMer(@RequestBody UserMerchant userMerchant) {
        return merchantService.userPutMer(userMerchant);
    }

}
