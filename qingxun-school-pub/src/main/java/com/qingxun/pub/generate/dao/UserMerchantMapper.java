package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserMerchant;
import com.qingxun.pub.generate.pojo.UserMerchantKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMerchantMapper {
    @Delete({
        "delete from user_merchant",
        "where _id = #{id,jdbcType=INTEGER}",
          "and mer_id = #{merId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(UserMerchantKey key);

    @Insert({
        "insert into user_merchant (_id, mer_id, ",
        "mer_name, mer_info, ",
        "mer_imgurl, mer_sturts, ",
        "mer_phone)",
        "values (#{id,jdbcType=INTEGER}, #{merId,jdbcType=INTEGER}, ",
        "#{merName,jdbcType=VARCHAR}, #{merInfo,jdbcType=VARCHAR}, ",
        "#{merImgurl,jdbcType=VARCHAR}, #{merSturts,jdbcType=INTEGER}, ",
        "#{merPhone,jdbcType=VARCHAR})"
    })
    int insert(UserMerchant record);

    @InsertProvider(type=UserMerchantSqlProvider.class, method="insertSelective")
    int insertSelective(UserMerchant record);

    @Select({
        "select",
        "_id, mer_id, mer_name, mer_info, mer_imgurl, mer_sturts, mer_phone",
        "from user_merchant",
        "where _id = #{id,jdbcType=INTEGER}",
          "and mer_id = #{merId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mer_name", property="merName", jdbcType=JdbcType.VARCHAR),
        @Result(column="mer_info", property="merInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="mer_imgurl", property="merImgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mer_sturts", property="merSturts", jdbcType=JdbcType.INTEGER),
        @Result(column="mer_phone", property="merPhone", jdbcType=JdbcType.VARCHAR)
    })
    UserMerchant selectByPrimaryKey(UserMerchantKey key);

    @UpdateProvider(type=UserMerchantSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserMerchant record);

    @Update({
        "update user_merchant",
        "set mer_name = #{merName,jdbcType=VARCHAR},",
          "mer_info = #{merInfo,jdbcType=VARCHAR},",
          "mer_imgurl = #{merImgurl,jdbcType=VARCHAR},",
          "mer_sturts = #{merSturts,jdbcType=INTEGER},",
          "mer_phone = #{merPhone,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}",
          "and mer_id = #{merId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserMerchant record);
}