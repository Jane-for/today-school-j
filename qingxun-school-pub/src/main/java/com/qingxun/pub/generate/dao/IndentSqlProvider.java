package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.Indent;
import org.apache.ibatis.jdbc.SQL;

public class IndentSqlProvider {

    public String insertSelective(Indent record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("indent");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getIndId() != null) {
            sql.VALUES("ind_id", "#{indId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getComId() != null) {
            sql.VALUES("com_id", "#{comId,jdbcType=INTEGER}");
        }
        
        if (record.getIndSturts() != null) {
            sql.VALUES("ind_sturts", "#{indSturts,jdbcType=INTEGER}");
        }
        
        if (record.getComNum() != null) {
            sql.VALUES("com_num", "#{comNum,jdbcType=INTEGER}");
        }
        
        if (record.getMerId() != null) {
            sql.VALUES("mer_id", "#{merId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Indent record) {
        SQL sql = new SQL();
        sql.UPDATE("indent");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getComId() != null) {
            sql.SET("com_id = #{comId,jdbcType=INTEGER}");
        }
        
        if (record.getIndSturts() != null) {
            sql.SET("ind_sturts = #{indSturts,jdbcType=INTEGER}");
        }
        
        if (record.getComNum() != null) {
            sql.SET("com_num = #{comNum,jdbcType=INTEGER}");
        }
        
        if (record.getMerId() != null) {
            sql.SET("mer_id = #{merId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        sql.WHERE("ind_id = #{indId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}