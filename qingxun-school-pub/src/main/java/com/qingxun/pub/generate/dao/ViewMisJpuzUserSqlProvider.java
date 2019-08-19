package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.ViewMisJpuzUser;
import org.apache.ibatis.jdbc.SQL;

public class ViewMisJpuzUserSqlProvider {

    public String insertSelective(ViewMisJpuzUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("view_mis_jpuz_user");
        
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
        
        if (record.getUserImgurl() != null) {
            sql.VALUES("user_imgurl", "#{userImgurl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}