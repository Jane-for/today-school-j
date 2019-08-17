package com.qingxun.app.merchantapi.service;

import com.qingxun.pub.generate.pojo.Commodity;
import com.qingxun.pub.generate.pojo.CommodityType1;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.merchant.CommodityDAO;
import com.qingxun.pub.user.UserUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class MerCommodityService {
    final
    CommodityDAO commodityDAO;
    final
    UserUserDAO userUserDAO;

    @Autowired
    public MerCommodityService(CommodityDAO commodityDAO, UserUserDAO userUserDAO) {
        this.commodityDAO = commodityDAO;
        this.userUserDAO = userUserDAO;
    }

    public Map<String, Object> get(String openId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        UserUser userUser = userUserDAO.selectByOpenid(openId);
        Integer merchantId = userUser.getMerchantId();
        List<Commodity> commodityList = commodityDAO.get(merchantId);
        resultMap.put("result", commodityList);
        return resultMap;
    }

    public Map<String, Object> getType1(String openId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        UserUser userUser = userUserDAO.selectByOpenid(openId);
        Integer merchantId = userUser.getMerchantId();
        List<CommodityType1> commodityType1List = commodityDAO.getType1(merchantId);
        resultMap.put("result", commodityType1List);
        return resultMap;
    }
}
