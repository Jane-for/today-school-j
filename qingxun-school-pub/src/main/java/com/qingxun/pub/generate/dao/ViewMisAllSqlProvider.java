package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.ViewMisAll;
import org.apache.ibatis.jdbc.SQL;

public class ViewMisAllSqlProvider {

    public String insertSelective(ViewMisAll record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("view_mis_all");
        
        if (record.getUserImgurl() != null) {
            sql.VALUES("user_imgurl", "#{userImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getFaqiId() != null) {
            sql.VALUES("faqi_id", "#{faqiId,jdbcType=INTEGER}");
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
        
        if (record.getMisTilte() != null) {
            sql.VALUES("mis_tilte", "#{misTilte,jdbcType=VARCHAR}");
        }
        
        if (record.getMisTop() != null) {
            sql.VALUES("mis_top", "#{misTop,jdbcType=INTEGER}");
        }
        
        if (record.getMisId() != null) {
            sql.VALUES("mis_id", "#{misId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }
}