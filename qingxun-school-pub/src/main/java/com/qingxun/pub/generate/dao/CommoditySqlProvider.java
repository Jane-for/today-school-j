package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.Commodity;
import org.apache.ibatis.jdbc.SQL;

public class CommoditySqlProvider {

    public String insertSelective(Commodity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("commodity");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMarId() != null) {
            sql.VALUES("mar_id", "#{marId,jdbcType=INTEGER}");
        }
        
        if (record.getComId() != null) {
            sql.VALUES("com_id", "#{comId,jdbcType=INTEGER}");
        }
        
        if (record.getComName() != null) {
            sql.VALUES("com_name", "#{comName,jdbcType=VARCHAR}");
        }
        
        if (record.getComImgurl() != null) {
            sql.VALUES("com_imgurl", "#{comImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getComMoney() != null) {
            sql.VALUES("com_money", "#{comMoney,jdbcType=VARCHAR}");
        }
        
        if (record.getType1Id() != null) {
            sql.VALUES("type1_id", "#{type1Id,jdbcType=INTEGER}");
        }
        
        if (record.getComStruts() != null) {
            sql.VALUES("com_struts", "#{comStruts,jdbcType=VARCHAR}");
        }
        
        if (record.getComTop() != null) {
            sql.VALUES("com_top", "#{comTop,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Commodity record) {
        SQL sql = new SQL();
        sql.UPDATE("commodity");
        
        if (record.getMarId() != null) {
            sql.SET("mar_id = #{marId,jdbcType=INTEGER}");
        }
        
        if (record.getComId() != null) {
            sql.SET("com_id = #{comId,jdbcType=INTEGER}");
        }
        
        if (record.getComName() != null) {
            sql.SET("com_name = #{comName,jdbcType=VARCHAR}");
        }
        
        if (record.getComImgurl() != null) {
            sql.SET("com_imgurl = #{comImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getComMoney() != null) {
            sql.SET("com_money = #{comMoney,jdbcType=VARCHAR}");
        }
        
        if (record.getType1Id() != null) {
            sql.SET("type1_id = #{type1Id,jdbcType=INTEGER}");
        }
        
        if (record.getComStruts() != null) {
            sql.SET("com_struts = #{comStruts,jdbcType=VARCHAR}");
        }
        
        if (record.getComTop() != null) {
            sql.SET("com_top = #{comTop,jdbcType=INTEGER}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}