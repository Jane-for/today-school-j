package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserUser;
import org.apache.ibatis.jdbc.SQL;

public class UserUserSqlProvider {

    public String insertSelective(UserUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_user");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getAdminId() != null) {
            sql.VALUES("admin_id", "#{adminId,jdbcType=INTEGER}");
        }
        
        if (record.getMerchantId() != null) {
            sql.VALUES("merchant_id", "#{merchantId,jdbcType=INTEGER}");
        }
        
        if (record.getUserImgurl() != null) {
            sql.VALUES("user_imgurl", "#{userImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserOpenid() != null) {
            sql.VALUES("user_openid", "#{userOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMoney() != null) {
            sql.VALUES("user_money", "#{userMoney,jdbcType=REAL}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserUser record) {
        SQL sql = new SQL();
        sql.UPDATE("user_user");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getAdminId() != null) {
            sql.SET("admin_id = #{adminId,jdbcType=INTEGER}");
        }
        
        if (record.getMerchantId() != null) {
            sql.SET("merchant_id = #{merchantId,jdbcType=INTEGER}");
        }
        
        if (record.getUserImgurl() != null) {
            sql.SET("user_imgurl = #{userImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserOpenid() != null) {
            sql.SET("user_openid = #{userOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMoney() != null) {
            sql.SET("user_money = #{userMoney,jdbcType=REAL}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}