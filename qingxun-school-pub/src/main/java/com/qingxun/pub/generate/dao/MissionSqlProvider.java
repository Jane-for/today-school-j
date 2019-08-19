package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.Mission;
import org.apache.ibatis.jdbc.SQL;

public class MissionSqlProvider {

    public String insertSelective(Mission record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mission");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMisId() != null) {
            sql.VALUES("mis_id", "#{misId,jdbcType=INTEGER}");
        }
        
        if (record.getFaqiId() != null) {
            sql.VALUES("faqi_id", "#{faqiId,jdbcType=INTEGER}");
        }
        
        if (record.getJpuzId() != null) {
            sql.VALUES("jpuz_id", "#{jpuzId,jdbcType=INTEGER}");
        }
        
        if (record.getMisTilte() != null) {
            sql.VALUES("mis_tilte", "#{misTilte,jdbcType=VARCHAR}");
        }
        
        if (record.getMisContent() != null) {
            sql.VALUES("mis_content", "#{misContent,jdbcType=VARCHAR}");
        }
        
        if (record.getMisTime1() != null) {
            sql.VALUES("mis_time1", "#{misTime1,jdbcType=VARCHAR}");
        }
        
        if (record.getMisTime2() != null) {
            sql.VALUES("mis_time2", "#{misTime2,jdbcType=VARCHAR}");
        }
        
        if (record.getMisStruts() != null) {
            sql.VALUES("mis_struts", "#{misStruts,jdbcType=INTEGER}");
        }
        
        if (record.getMisXuqqnum() != null) {
            sql.VALUES("mis_xuqqnum", "#{misXuqqnum,jdbcType=INTEGER}");
        }
        
        if (record.getMisMoney() != null) {
            sql.VALUES("mis_money", "#{misMoney,jdbcType=REAL}");
        }
        
        if (record.getMisTop() != null) {
            sql.VALUES("mis_top", "#{misTop,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Mission record) {
        SQL sql = new SQL();
        sql.UPDATE("mission");
        
        if (record.getMisId() != null) {
            sql.SET("mis_id = #{misId,jdbcType=INTEGER}");
        }
        
        if (record.getFaqiId() != null) {
            sql.SET("faqi_id = #{faqiId,jdbcType=INTEGER}");
        }
        
        if (record.getJpuzId() != null) {
            sql.SET("jpuz_id = #{jpuzId,jdbcType=INTEGER}");
        }
        
        if (record.getMisTilte() != null) {
            sql.SET("mis_tilte = #{misTilte,jdbcType=VARCHAR}");
        }
        
        if (record.getMisContent() != null) {
            sql.SET("mis_content = #{misContent,jdbcType=VARCHAR}");
        }
        
        if (record.getMisTime1() != null) {
            sql.SET("mis_time1 = #{misTime1,jdbcType=VARCHAR}");
        }
        
        if (record.getMisTime2() != null) {
            sql.SET("mis_time2 = #{misTime2,jdbcType=VARCHAR}");
        }
        
        if (record.getMisStruts() != null) {
            sql.SET("mis_struts = #{misStruts,jdbcType=INTEGER}");
        }
        
        if (record.getMisXuqqnum() != null) {
            sql.SET("mis_xuqqnum = #{misXuqqnum,jdbcType=INTEGER}");
        }
        
        if (record.getMisMoney() != null) {
            sql.SET("mis_money = #{misMoney,jdbcType=REAL}");
        }
        
        if (record.getMisTop() != null) {
            sql.SET("mis_top = #{misTop,jdbcType=INTEGER}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}