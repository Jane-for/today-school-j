package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.ViewMisJpuzUfqk;
import org.apache.ibatis.jdbc.SQL;

public class ViewMisJpuzUfqkSqlProvider {

    public String insertSelective(ViewMisJpuzUfqk record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("view_mis_jpuz_ufqk");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getFaqiId() != null) {
            sql.VALUES("faqi_id", "#{faqiId,jdbcType=INTEGER}");
        }
        
        if (record.getUserImgurl() != null) {
            sql.VALUES("user_imgurl", "#{userImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getMisTilte() != null) {
            sql.VALUES("mis_tilte", "#{misTilte,jdbcType=VARCHAR}");
        }
        
        if (record.getJpuzSturts() != null) {
            sql.VALUES("jpuz_sturts", "#{jpuzSturts,jdbcType=VARCHAR}");
        }
        
        if (record.getJpuzTime() != null) {
            sql.VALUES("jpuz_time", "#{jpuzTime,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}