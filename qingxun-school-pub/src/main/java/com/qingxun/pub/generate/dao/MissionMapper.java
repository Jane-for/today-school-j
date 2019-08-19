package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.Mission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MissionMapper {
    @Delete({
        "delete from mission",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mission (_id, mis_id, ",
        "faqi_id, jpuz_id, ",
        "mis_tilte, mis_content, ",
        "mis_time1, mis_time2, ",
        "mis_struts, mis_xuqqnum, ",
        "mis_money, mis_top)",
        "values (#{id,jdbcType=INTEGER}, #{misId,jdbcType=INTEGER}, ",
        "#{faqiId,jdbcType=INTEGER}, #{jpuzId,jdbcType=INTEGER}, ",
        "#{misTilte,jdbcType=VARCHAR}, #{misContent,jdbcType=VARCHAR}, ",
        "#{misTime1,jdbcType=VARCHAR}, #{misTime2,jdbcType=VARCHAR}, ",
        "#{misStruts,jdbcType=INTEGER}, #{misXuqqnum,jdbcType=INTEGER}, ",
        "#{misMoney,jdbcType=REAL}, #{misTop,jdbcType=INTEGER})"
    })
    int insert(Mission record);

    @InsertProvider(type=MissionSqlProvider.class, method="insertSelective")
    int insertSelective(Mission record);

    @Select({
        "select",
        "_id, mis_id, faqi_id, jpuz_id, mis_tilte, mis_content, mis_time1, mis_time2, ",
        "mis_struts, mis_xuqqnum, mis_money, mis_top",
        "from mission",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mis_id", property="misId", jdbcType=JdbcType.INTEGER),
        @Result(column="faqi_id", property="faqiId", jdbcType=JdbcType.INTEGER),
        @Result(column="jpuz_id", property="jpuzId", jdbcType=JdbcType.INTEGER),
        @Result(column="mis_tilte", property="misTilte", jdbcType=JdbcType.VARCHAR),
        @Result(column="mis_content", property="misContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="mis_time1", property="misTime1", jdbcType=JdbcType.VARCHAR),
        @Result(column="mis_time2", property="misTime2", jdbcType=JdbcType.VARCHAR),
        @Result(column="mis_struts", property="misStruts", jdbcType=JdbcType.INTEGER),
        @Result(column="mis_xuqqnum", property="misXuqqnum", jdbcType=JdbcType.INTEGER),
        @Result(column="mis_money", property="misMoney", jdbcType=JdbcType.REAL),
        @Result(column="mis_top", property="misTop", jdbcType=JdbcType.INTEGER)
    })
    Mission selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MissionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Mission record);

    @Update({
        "update mission",
        "set mis_id = #{misId,jdbcType=INTEGER},",
          "faqi_id = #{faqiId,jdbcType=INTEGER},",
          "jpuz_id = #{jpuzId,jdbcType=INTEGER},",
          "mis_tilte = #{misTilte,jdbcType=VARCHAR},",
          "mis_content = #{misContent,jdbcType=VARCHAR},",
          "mis_time1 = #{misTime1,jdbcType=VARCHAR},",
          "mis_time2 = #{misTime2,jdbcType=VARCHAR},",
          "mis_struts = #{misStruts,jdbcType=INTEGER},",
          "mis_xuqqnum = #{misXuqqnum,jdbcType=INTEGER},",
          "mis_money = #{misMoney,jdbcType=REAL},",
          "mis_top = #{misTop,jdbcType=INTEGER}",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Mission record);
}