package com.qingxun.pub.mission;

import com.qingxun.pub.generate.pojo.ViewMisJpuzUfqk;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ViewMisJpuzUfqkDAO {


    @Select({
            "SELECT * FROM view_mis_jpuz_ufqk WHERE faqi_id =  ${userId} AND jpuz_sturts = ${type}"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER),
            @Result(column = "faqi_id", property = "faqiId", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_imgurl", property = "userImgurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "jpuz_sturts", property = "jpuzSturts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "jpuz_time", property = "jpuzTime", jdbcType = JdbcType.VARCHAR)
    })
    List<ViewMisJpuzUfqk> userUpMisType(@Param("userId") Integer userId, @Param("type") String type);


    @Update({
            "UPDATE `view_mis_jpuz_ufqk` SET `jpuz_sturts` = ${type} WHERE _id = ${id} AND faqi_id = ${faqi_id}"
    })
    int userUpMis(@Param("faqi_id") Integer userId, @Param("type") String type, @Param("id") String id);
}
