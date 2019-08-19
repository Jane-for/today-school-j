package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.AppCarousel;
import org.apache.ibatis.jdbc.SQL;

public class AppCarouselSqlProvider {

    public String insertSelective(AppCarousel record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("app_carousel");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCarId() != null) {
            sql.VALUES("car_id", "#{carId,jdbcType=INTEGER}");
        }
        
        if (record.getCarImgurl() != null) {
            sql.VALUES("car_imgurl", "#{carImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getCarContent() != null) {
            sql.VALUES("car_content", "#{carContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCarActivity() != null) {
            sql.VALUES("car_activity", "#{carActivity,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTime() != null) {
            sql.VALUES("car_time", "#{carTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AppCarousel record) {
        SQL sql = new SQL();
        sql.UPDATE("app_carousel");
        
        if (record.getCarImgurl() != null) {
            sql.SET("car_imgurl = #{carImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getCarContent() != null) {
            sql.SET("car_content = #{carContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCarActivity() != null) {
            sql.SET("car_activity = #{carActivity,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTime() != null) {
            sql.SET("car_time = #{carTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        sql.WHERE("car_id = #{carId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}