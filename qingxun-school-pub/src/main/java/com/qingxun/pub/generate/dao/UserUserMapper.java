package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserUserMapper {
    @Delete({
        "delete from user_user",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_user (_id, user_id, ",
        "admin_id, merchant_id, ",
        "user_imgurl, user_openid, ",
        "user_money)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{adminId,jdbcType=INTEGER}, #{merchantId,jdbcType=INTEGER}, ",
        "#{userImgurl,jdbcType=VARCHAR}, #{userOpenid,jdbcType=VARCHAR}, ",
        "#{userMoney,jdbcType=REAL})"
    })
    int insert(UserUser record);

    @InsertProvider(type=UserUserSqlProvider.class, method="insertSelective")
    int insertSelective(UserUser record);

    @Select({
        "select",
        "_id, user_id, admin_id, merchant_id, user_imgurl, user_openid, user_money",
        "from user_user",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER),
        @Result(column="merchant_id", property="merchantId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_imgurl", property="userImgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_openid", property="userOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_money", property="userMoney", jdbcType=JdbcType.REAL)
    })
    UserUser selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserUser record);

    @Update({
        "update user_user",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "admin_id = #{adminId,jdbcType=INTEGER},",
          "merchant_id = #{merchantId,jdbcType=INTEGER},",
          "user_imgurl = #{userImgurl,jdbcType=VARCHAR},",
          "user_openid = #{userOpenid,jdbcType=VARCHAR},",
          "user_money = #{userMoney,jdbcType=REAL}",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserUser record);
}