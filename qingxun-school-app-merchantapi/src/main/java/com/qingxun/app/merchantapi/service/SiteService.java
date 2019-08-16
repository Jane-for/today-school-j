package com.qingxun.app.merchantapi.service;

import com.qingxun.pub.generate.dao.UserUserOthMapper;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.generate.pojo.UserUserOth;
import com.qingxun.pub.merchant.SiteDAO;
import com.qingxun.pub.user.UserUserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SiteService {

    private final
    UserUserDAO userUserDAO;

    final
    UserUserOthMapper userUserOthMapper;

    private final
    SiteDAO siteDAO;
    private Logger logger = LoggerFactory.getLogger(SiteService.class);

    @Autowired
    public SiteService(SiteDAO siteDAO, UserUserDAO userUserDAO, UserUserOthMapper userUserOthMapper) {
        this.siteDAO = siteDAO;
        this.userUserDAO = userUserDAO;
        this.userUserOthMapper = userUserOthMapper;
    }

    public Map<String, Object> get(String openId) {

        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        UserUser userUser = userUserDAO.selectByOpenid(openId);
        Integer userId = userUser.getUserId();

        List<UserUserOth> userUserOth = siteDAO.get(userId);

        logger.info("SiteService", userUserOth);

        resultMap.put("result", userUserOth);
        return resultMap;
    }

    public Map<String, Object> userAddSite(String openId, UserUserOth userUserOth) {

        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);

        UserUser userUser = userUserDAO.selectByOpenid(openId);
        Integer userId = userUser.getUserId();
        userUserOth.setUserId(userId);
        int maxId = siteDAO.getMaxId() + 1;
        userUserOth.setOthId(maxId);
//        userUserOth.
        int num = userUserOthMapper.insertSelective(userUserOth);

        logger.info("SiteService", num);

        resultMap.put("result", num);
        return resultMap;
    }
}
