package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.MissionJpuz;
import org.apache.ibatis.jdbc.SQL;

public class MissionJpuzSqlProvider {

    public String insertSelective(MissionJpuz record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mission_jpuz");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getJpuzId() != null) {
            sql.VALUES("jpuz_id", "#{jpuzId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getJpuzTime() != null) {
            sql.VALUES("jpuz_time", "#{jpuzTime,jdbcType=VARCHAR}");
        }
        
        if (record.getJpuzSturts() != null) {
            sql.VALUES("jpuz_sturts", "#{jpuzSturts,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MissionJpuz record) {
        SQL sql = new SQL();
        sql.UPDATE("mission_jpuz");
        
        if (record.getJpuzId() != null) {
            sql.SET("jpuz_id = #{jpuzId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getJpuzTime() != null) {
            sql.SET("jpuz_time = #{jpuzTime,jdbcType=VARCHAR}");
        }
        
        if (record.getJpuzSturts() != null) {
            sql.SET("jpuz_sturts = #{jpuzSturts,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}