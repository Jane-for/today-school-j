package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.CommodityType2;
import org.apache.ibatis.jdbc.SQL;

public class CommodityType2SqlProvider {

    public String insertSelective(CommodityType2 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("commodity_type2");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getType2Id() != null) {
            sql.VALUES("type2_id", "#{type2Id,jdbcType=INTEGER}");
        }
        
        if (record.getType1Id() != null) {
            sql.VALUES("type1_id", "#{type1Id,jdbcType=INTEGER}");
        }
        
        if (record.getType2Name() != null) {
            sql.VALUES("type2_name", "#{type2Name,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CommodityType2 record) {
        SQL sql = new SQL();
        sql.UPDATE("commodity_type2");
        
        if (record.getType2Id() != null) {
            sql.SET("type2_id = #{type2Id,jdbcType=INTEGER}");
        }
        
        if (record.getType1Id() != null) {
            sql.SET("type1_id = #{type1Id,jdbcType=INTEGER}");
        }
        
        if (record.getType2Name() != null) {
            sql.SET("type2_name = #{type2Name,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}