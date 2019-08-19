package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserUserOth;
import com.qingxun.pub.generate.pojo.UserUserOthKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserUserOthMapper {
    @Delete({
        "delete from user_user_oth",
        "where _id = #{id,jdbcType=INTEGER}",
          "and oth_id = #{othId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(UserUserOthKey key);

    @Insert({
        "insert into user_user_oth (_id, oth_id, ",
        "oth_phone, oth_suue, ",
        "oth_school, user_id, ",
        "oth_name)",
        "values (#{id,jdbcType=INTEGER}, #{othId,jdbcType=INTEGER}, ",
        "#{othPhone,jdbcType=VARCHAR}, #{othSuue,jdbcType=VARCHAR}, ",
        "#{othSchool,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
        "#{othName,jdbcType=VARCHAR})"
    })
    int insert(UserUserOth record);

    @InsertProvider(type=UserUserOthSqlProvider.class, method="insertSelective")
    int insertSelective(UserUserOth record);

    @Select({
        "select",
        "_id, oth_id, oth_phone, oth_suue, oth_school, user_id, oth_name",
        "from user_user_oth",
        "where _id = #{id,jdbcType=INTEGER}",
          "and oth_id = #{othId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="oth_id", property="othId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="oth_phone", property="othPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="oth_suue", property="othSuue", jdbcType=JdbcType.VARCHAR),
        @Result(column="oth_school", property="othSchool", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="oth_name", property="othName", jdbcType=JdbcType.VARCHAR)
    })
    UserUserOth selectByPrimaryKey(UserUserOthKey key);

    @UpdateProvider(type=UserUserOthSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserUserOth record);

    @Update({
        "update user_user_oth",
        "set oth_phone = #{othPhone,jdbcType=VARCHAR},",
          "oth_suue = #{othSuue,jdbcType=VARCHAR},",
          "oth_school = #{othSchool,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "oth_name = #{othName,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}",
          "and oth_id = #{othId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserUserOth record);
}