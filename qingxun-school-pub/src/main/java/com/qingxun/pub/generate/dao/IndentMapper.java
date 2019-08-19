package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.Indent;
import com.qingxun.pub.generate.pojo.IndentKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface IndentMapper {
    @Delete({
        "delete from indent",
        "where _id = #{id,jdbcType=INTEGER}",
          "and ind_id = #{indId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(IndentKey key);

    @Insert({
        "insert into indent (_id, ind_id, ",
        "user_id, com_id, ind_sturts, ",
        "com_num, mer_id)",
        "values (#{id,jdbcType=INTEGER}, #{indId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{comId,jdbcType=INTEGER}, #{indSturts,jdbcType=INTEGER}, ",
        "#{comNum,jdbcType=INTEGER}, #{merId,jdbcType=INTEGER})"
    })
    int insert(Indent record);

    @InsertProvider(type=IndentSqlProvider.class, method="insertSelective")
    int insertSelective(Indent record);

    @Select({
        "select",
        "_id, ind_id, user_id, com_id, ind_sturts, com_num, mer_id",
        "from indent",
        "where _id = #{id,jdbcType=INTEGER}",
          "and ind_id = #{indId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ind_id", property="indId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="com_id", property="comId", jdbcType=JdbcType.INTEGER),
        @Result(column="ind_sturts", property="indSturts", jdbcType=JdbcType.INTEGER),
        @Result(column="com_num", property="comNum", jdbcType=JdbcType.INTEGER),
        @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER)
    })
    Indent selectByPrimaryKey(IndentKey key);

    @UpdateProvider(type=IndentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Indent record);

    @Update({
        "update indent",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "com_id = #{comId,jdbcType=INTEGER},",
          "ind_sturts = #{indSturts,jdbcType=INTEGER},",
          "com_num = #{comNum,jdbcType=INTEGER},",
          "mer_id = #{merId,jdbcType=INTEGER}",
        "where _id = #{id,jdbcType=INTEGER}",
          "and ind_id = #{indId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Indent record);
}