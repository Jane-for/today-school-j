package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.CommodityType2;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CommodityType2Mapper {
    @Delete({
        "delete from commodity_type2",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into commodity_type2 (_id, type2_id, ",
        "type1_id, type2_name)",
        "values (#{id,jdbcType=INTEGER}, #{type2Id,jdbcType=INTEGER}, ",
        "#{type1Id,jdbcType=INTEGER}, #{type2Name,jdbcType=VARCHAR})"
    })
    int insert(CommodityType2 record);

    @InsertProvider(type=CommodityType2SqlProvider.class, method="insertSelective")
    int insertSelective(CommodityType2 record);

    @Select({
        "select",
        "_id, type2_id, type1_id, type2_name",
        "from commodity_type2",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type2_id", property="type2Id", jdbcType=JdbcType.INTEGER),
        @Result(column="type1_id", property="type1Id", jdbcType=JdbcType.INTEGER),
        @Result(column="type2_name", property="type2Name", jdbcType=JdbcType.VARCHAR)
    })
    CommodityType2 selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CommodityType2SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CommodityType2 record);

    @Update({
        "update commodity_type2",
        "set type2_id = #{type2Id,jdbcType=INTEGER},",
          "type1_id = #{type1Id,jdbcType=INTEGER},",
          "type2_name = #{type2Name,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommodityType2 record);
}