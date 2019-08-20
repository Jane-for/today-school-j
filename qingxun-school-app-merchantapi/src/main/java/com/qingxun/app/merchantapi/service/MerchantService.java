package com.qingxun.app.merchantapi.service;

import com.qingxun.pub.generate.dao.UserMerchantMapper;
import com.qingxun.pub.generate.pojo.UserMerchant;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.merchant.UserMerchantDAO;
import com.qingxun.pub.user.UserUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class MerchantService {

    final
    UserMerchantDAO userMerchantDAO;
    final
    UserMerchantMapper userMerchantMapper;
    final
    UserUserDAO userUserDAO;



    @Autowired
    public MerchantService(UserMerchantDAO userMerchantDAO, UserMerchantMapper userMerchantMapper, UserUserDAO userUserDAO) {
        this.userMerchantDAO = userMerchantDAO;
        this.userMerchantMapper = userMerchantMapper;
        this.userUserDAO = userUserDAO;
    }

    public Map<String, Object> userPutMer(String userIdByToken, Map<String, Object> map) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);
        String name = map.get("name").toString();
        String info = map.get("info").toString();
        String phone = map.get("phone").toString();
        String imgUrl = map.get("imgUrl").toString();


        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer userId = userUser.getUserId();
        int maxMerId = userMerchantDAO.getMaxMerId() + 1;
        UserMerchant userMerchant = new UserMerchant();
        userMerchant.setMerName(name);
        userMerchant.setMerInfo(info);
        userMerchant.setMerPhone(phone);
        userMerchant.setMerId(maxMerId);
        //
        userMerchant.setMerSturts(0);
        userMerchant.setMerImgurl(imgUrl);
//        userMerchant.set
        int insert = userMerchantMapper.insertSelective(userMerchant);
        //判断商铺是否添加成功,成功后更新用户信息
        if (insert == 1) {
            int i = userUserDAO.userPutMer(userId, userMerchant.getMerId());
            if (i == 1) {
                resultMap.put("result", "申请成功");
            } else {
                resultMap.put("result", "异常");
            }

        } else {
            resultMap.put("result", "申请失败");
        }

        return resultMap;
    }

    public Map<String, Object> ifUserPutMer(String userIdByToken) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        UserUser userUser = userUserDAO.selectByOpenid(userIdByToken);
        Integer id = userUser.getUserId();
        int i = userMerchantDAO.ifUserPutMer(id);
        resultMap.put("result", i);
        return resultMap;
    }

    public Map<String, Object> userGetMer(String openId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        UserUser userUser = userUserDAO.selectByOpenid(openId);
        Integer userId = userUser.getMerchantId();
        UserMerchant userMerchant = userMerchantDAO.userGetMer(userId);
        resultMap.put("result", userMerchant);
        return resultMap;
    }

//    public Map<String, Object> getNewCom()
}
