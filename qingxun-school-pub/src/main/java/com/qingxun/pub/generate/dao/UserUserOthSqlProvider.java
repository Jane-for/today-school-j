package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserUserOth;
import org.apache.ibatis.jdbc.SQL;

public class UserUserOthSqlProvider {

    public String insertSelective(UserUserOth record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_user_oth");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getOthId() != null) {
            sql.VALUES("oth_id", "#{othId,jdbcType=INTEGER}");
        }
        
        if (record.getOthPhone() != null) {
            sql.VALUES("oth_phone", "#{othPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getOthSuue() != null) {
            sql.VALUES("oth_suue", "#{othSuue,jdbcType=VARCHAR}");
        }
        
        if (record.getOthSchool() != null) {
            sql.VALUES("oth_school", "#{othSchool,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getOthName() != null) {
            sql.VALUES("oth_name", "#{othName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserUserOth record) {
        SQL sql = new SQL();
        sql.UPDATE("user_user_oth");
        
        if (record.getOthPhone() != null) {
            sql.SET("oth_phone = #{othPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getOthSuue() != null) {
            sql.SET("oth_suue = #{othSuue,jdbcType=VARCHAR}");
        }
        
        if (record.getOthSchool() != null) {
            sql.SET("oth_school = #{othSchool,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getOthName() != null) {
            sql.SET("oth_name = #{othName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        sql.WHERE("oth_id = #{othId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}