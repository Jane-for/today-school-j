package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.CommodityType1;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CommodityType1Mapper {
    @Delete({
        "delete from commodity_type1",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into commodity_type1 (_id, mer_id, ",
        "type1_name)",
        "values (#{id,jdbcType=INTEGER}, #{merId,jdbcType=INTEGER}, ",
        "#{type1Name,jdbcType=VARCHAR})"
    })
    int insert(CommodityType1 record);

    @InsertProvider(type=CommodityType1SqlProvider.class, method="insertSelective")
    int insertSelective(CommodityType1 record);

    @Select({
        "select",
        "_id, mer_id, type1_name",
        "from commodity_type1",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER),
        @Result(column="type1_name", property="type1Name", jdbcType=JdbcType.VARCHAR)
    })
    CommodityType1 selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CommodityType1SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CommodityType1 record);

    @Update({
        "update commodity_type1",
        "set mer_id = #{merId,jdbcType=INTEGER},",
          "type1_name = #{type1Name,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommodityType1 record);
}