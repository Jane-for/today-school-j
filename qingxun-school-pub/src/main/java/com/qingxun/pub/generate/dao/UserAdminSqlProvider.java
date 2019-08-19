package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserAdmin;
import org.apache.ibatis.jdbc.SQL;

public class UserAdminSqlProvider {

    public String insertSelective(UserAdmin record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_admin");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAdminId() != null) {
            sql.VALUES("admin_id", "#{adminId,jdbcType=INTEGER}");
        }
        
        if (record.getAdminLogin() != null) {
            sql.VALUES("admin_login", "#{adminLogin,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminPsd() != null) {
            sql.VALUES("admin_psd", "#{adminPsd,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminName() != null) {
            sql.VALUES("admin_name", "#{adminName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserAdmin record) {
        SQL sql = new SQL();
        sql.UPDATE("user_admin");
        
        if (record.getAdminLogin() != null) {
            sql.SET("admin_login = #{adminLogin,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminPsd() != null) {
            sql.SET("admin_psd = #{adminPsd,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminName() != null) {
            sql.SET("admin_name = #{adminName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        sql.WHERE("admin_id = #{adminId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}