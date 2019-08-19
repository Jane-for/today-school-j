package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.CommodityType1;
import org.apache.ibatis.jdbc.SQL;

public class CommodityType1SqlProvider {

    public String insertSelective(CommodityType1 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("commodity_type1");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMerId() != null) {
            sql.VALUES("mer_id", "#{merId,jdbcType=INTEGER}");
        }
        
        if (record.getType1Name() != null) {
            sql.VALUES("type1_name", "#{type1Name,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CommodityType1 record) {
        SQL sql = new SQL();
        sql.UPDATE("commodity_type1");
        
        if (record.getMerId() != null) {
            sql.SET("mer_id = #{merId,jdbcType=INTEGER}");
        }
        
        if (record.getType1Name() != null) {
            sql.SET("type1_name = #{type1Name,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}