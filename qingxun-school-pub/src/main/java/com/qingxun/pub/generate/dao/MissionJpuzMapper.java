package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.MissionJpuz;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MissionJpuzMapper {
    @Delete({
        "delete from mission_jpuz",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mission_jpuz (_id, jpuz_id, ",
        "user_id, jpuz_time, ",
        "jpuz_sturts)",
        "values (#{id,jdbcType=INTEGER}, #{jpuzId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{jpuzTime,jdbcType=VARCHAR}, ",
        "#{jpuzSturts,jdbcType=VARCHAR})"
    })
    int insert(MissionJpuz record);

    @InsertProvider(type=MissionJpuzSqlProvider.class, method="insertSelective")
    int insertSelective(MissionJpuz record);

    @Select({
        "select",
        "_id, jpuz_id, user_id, jpuz_time, jpuz_sturts",
        "from mission_jpuz",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="jpuz_id", property="jpuzId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="jpuz_time", property="jpuzTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="jpuz_sturts", property="jpuzSturts", jdbcType=JdbcType.VARCHAR)
    })
    MissionJpuz selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MissionJpuzSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MissionJpuz record);

    @Update({
        "update mission_jpuz",
        "set jpuz_id = #{jpuzId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "jpuz_time = #{jpuzTime,jdbcType=VARCHAR},",
          "jpuz_sturts = #{jpuzSturts,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MissionJpuz record);
}