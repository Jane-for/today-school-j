package com.qingxun.app.merchantapi.service;

import com.qingxun.pub.Result;
import com.qingxun.pub.commodity.CommodityType1DAO;
import com.qingxun.pub.generate.dao.CommodityMapper;
import com.qingxun.pub.generate.dao.CommodityType1Mapper;
import com.qingxun.pub.generate.pojo.Commodity;
import com.qingxun.pub.generate.pojo.CommodityType1;
import com.qingxun.pub.generate.pojo.UserMerchant;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.merchant.CommodityDAO;
import com.qingxun.pub.user.UserUserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    CommodityMapper commodityMapper;

    @Autowired
    CommodityType1DAO commodityType1DAO;

    @Autowired
    CommodityType1Mapper commodityType1Mapper;

    Logger logger = LoggerFactory.getLogger(MerchantService.class);

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

    public Map<String, Object> userAddCom(String openId, Commodity commodity) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        UserUser userUser = userUserDAO.selectByOpenid(openId);
        Integer merchantId = userUser.getMerchantId();
        commodity.setMarId(merchantId);
        int maxComId = commodityDAO.getMaxComId();
        commodity.setComId(maxComId+1);
        int insert = commodityMapper.insert(commodity);
        if (insert == 1) {
            resultMap.put("result", "添加成功");
        }

        return resultMap;
    }

    public Map<String, Object> addType(String openId, Map<String, Object> map) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        String name = map.get("name").toString();

        UserUser userUser = userUserDAO.selectByOpenid(openId);
        Integer merchantId = userUser.getMerchantId();
        CommodityType1 commodityType1 = new CommodityType1();
        commodityType1.setType1Name(name);
        commodityType1.setMerId(merchantId);
        logger.info(commodityType1.toString());
        logger.info("merchantId###"+merchantId);
        int insert = commodityType1Mapper.insertSelective(commodityType1);
        if (insert == 1) {
            resultMap.put("result", "添加成功");
        }
        return resultMap;
    }

    public Map<String, Object> userUpCom(String openId, Commodity commodity) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        UserUser userUser = null;
        try {
            userUser = userUserDAO.selectByOpenid(openId);

            Integer merchantId = userUser.getMerchantId();
            commodity.setMarId(merchantId);
            int insert = commodityMapper.updateByPrimaryKey(commodity);
            if (insert == 1) {
                resultMap.put("result", "修改成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultMap;
    }

    public Result getNewCom() {
        Result result = new Result();
        result.setResultcode(200);
        List<Commodity> commodityList = commodityDAO.getNewCom();
        result.setResult(commodityList);
        return result;
    }

    public Result getNewMer() {

        Result result = new Result();
        result.setResultcode(200);
        List<UserMerchant> userMerchantList = commodityDAO.getNewMer();
        result.setResult(userMerchantList);
        return result;
    }
}
