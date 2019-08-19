package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserMerchant;
import org.apache.ibatis.jdbc.SQL;

public class UserMerchantSqlProvider {

    public String insertSelective(UserMerchant record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_merchant");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMerId() != null) {
            sql.VALUES("mer_id", "#{merId,jdbcType=INTEGER}");
        }
        
        if (record.getMerName() != null) {
            sql.VALUES("mer_name", "#{merName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerInfo() != null) {
            sql.VALUES("mer_info", "#{merInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getMerImgurl() != null) {
            sql.VALUES("mer_imgurl", "#{merImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getMerSturts() != null) {
            sql.VALUES("mer_sturts", "#{merSturts,jdbcType=INTEGER}");
        }
        
        if (record.getMerPhone() != null) {
            sql.VALUES("mer_phone", "#{merPhone,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserMerchant record) {
        SQL sql = new SQL();
        sql.UPDATE("user_merchant");
        
        if (record.getMerName() != null) {
            sql.SET("mer_name = #{merName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerInfo() != null) {
            sql.SET("mer_info = #{merInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getMerImgurl() != null) {
            sql.SET("mer_imgurl = #{merImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getMerSturts() != null) {
            sql.SET("mer_sturts = #{merSturts,jdbcType=INTEGER}");
        }
        
        if (record.getMerPhone() != null) {
            sql.SET("mer_phone = #{merPhone,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        sql.WHERE("mer_id = #{merId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}