package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.Commodity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CommodityMapper {
    @Delete({
        "delete from commodity",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into commodity (_id, mar_id, ",
        "com_id, com_name, ",
        "com_imgurl, com_money, ",
        "type1_id, com_struts, ",
        "com_top)",
        "values (#{id,jdbcType=INTEGER}, #{marId,jdbcType=INTEGER}, ",
        "#{comId,jdbcType=INTEGER}, #{comName,jdbcType=VARCHAR}, ",
        "#{comImgurl,jdbcType=VARCHAR}, #{comMoney,jdbcType=VARCHAR}, ",
        "#{type1Id,jdbcType=INTEGER}, #{comStruts,jdbcType=VARCHAR}, ",
        "#{comTop,jdbcType=INTEGER})"
    })
    int insert(Commodity record);

    @InsertProvider(type=CommoditySqlProvider.class, method="insertSelective")
    int insertSelective(Commodity record);

    @Select({
        "select",
        "_id, mar_id, com_id, com_name, com_imgurl, com_money, type1_id, com_struts, ",
        "com_top",
        "from commodity",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mar_id", property="marId", jdbcType=JdbcType.INTEGER),
        @Result(column="com_id", property="comId", jdbcType=JdbcType.INTEGER),
        @Result(column="com_name", property="comName", jdbcType=JdbcType.VARCHAR),
        @Result(column="com_imgurl", property="comImgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="com_money", property="comMoney", jdbcType=JdbcType.VARCHAR),
        @Result(column="type1_id", property="type1Id", jdbcType=JdbcType.INTEGER),
        @Result(column="com_struts", property="comStruts", jdbcType=JdbcType.VARCHAR),
        @Result(column="com_top", property="comTop", jdbcType=JdbcType.INTEGER)
    })
    Commodity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CommoditySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Commodity record);

    @Update({
        "update commodity",
        "set mar_id = #{marId,jdbcType=INTEGER},",
          "com_id = #{comId,jdbcType=INTEGER},",
          "com_name = #{comName,jdbcType=VARCHAR},",
          "com_imgurl = #{comImgurl,jdbcType=VARCHAR},",
          "com_money = #{comMoney,jdbcType=VARCHAR},",
          "type1_id = #{type1Id,jdbcType=INTEGER},",
          "com_struts = #{comStruts,jdbcType=VARCHAR},",
          "com_top = #{comTop,jdbcType=INTEGER}",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Commodity record);
}