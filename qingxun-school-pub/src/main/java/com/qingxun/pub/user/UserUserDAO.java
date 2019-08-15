package com.qingxun.pub.user;

import com.qingxun.pub.generate.pojo.UserUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserUserDAO {
    @Select("SELECT MAX(user_id) FROM user_user")
    int getMaxId();

    @Select("SELECT MAX(_id) FROM user_user")
    int getMax_Id();


    @Select({
            "select ",
            "* ",
            "from user_user ",
            "where user_openid = '${id}'"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "admin_id", property = "adminId", jdbcType = JdbcType.INTEGER),
            @Result(column = "merchant_id", property = "merchantId", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_imgurl", property = "userImgurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_openid", property = "userOpenid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_money", property = "userMoney", jdbcType = JdbcType.REAL)
    })
    UserUser selectByPrimaryKey(@Param("id") String id);


    @Insert({
            "insert into user_user (user_id, ",
            "admin_id, merchant_id, ",
            "user_imgurl, user_openid)",
            "values (#{userId,jdbcType=INTEGER}, ",
            "#{adminId,jdbcType=INTEGER}, #{merchantId,jdbcType=INTEGER}, ",
            "#{userImgurl,jdbcType=VARCHAR}, #{userOpenid,jdbcType=VARCHAR})"
    })
    int insert(UserUser record);

    @Select({
            "select ",
            "* ",
            "from user_user ",
            "where user_openid = '${id}'"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "admin_id", property = "adminId", jdbcType = JdbcType.INTEGER),
            @Result(column = "merchant_id", property = "merchantId", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_imgurl", property = "userImgurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_openid", property = "userOpenid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_money", property = "userMoney", jdbcType = JdbcType.REAL)
    })
    UserUser selectByOpenid(@Param("id") String openid);

    @Update({
            "update user_user",
            "set user_imgurl = '${img}'",
            "where user_openid = '${id}'"
    })
    int updateByOpenid(@Param("img") String s, @Param("id") String openid);
}
