package com.qingxun.pub.merchant;

import com.qingxun.pub.generate.pojo.UserUserOth;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface SiteDAO {
    @Select({
            "SELECT * FROM user_user_oth WHERE user_id = ${userId}"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "oth_id", property = "othId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "oth_phone", property = "othPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "oth_suue", property = "othSuue", jdbcType = JdbcType.VARCHAR),
            @Result(column = "oth_school", property = "othSchool", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "oth_name", property = "othName", jdbcType = JdbcType.VARCHAR)
    })
    List<UserUserOth> get(@Param("userId") Integer userId);


    @Select({
            "SELECT MAX(oth_id) FROM user_user_oth"
    })
    int getMaxId();

    @Delete({
            "DELETE FROM `qingxun_school`.`user_user_oth` WHERE `_id` = ${id} AND `user_id` = ${user_id}"
    })
    int delSite(@Param("user_id") Integer userId, @Param("id") String id);
}
