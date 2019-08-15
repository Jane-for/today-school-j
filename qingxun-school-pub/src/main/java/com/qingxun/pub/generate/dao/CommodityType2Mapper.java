package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.CommodityType2;
import com.qingxun.pub.generate.pojo.CommodityType2Example;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CommodityType2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @SelectProvider(type=CommodityType2SqlProvider.class, method="countByExample")
    long countByExample(CommodityType2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @DeleteProvider(type=CommodityType2SqlProvider.class, method="deleteByExample")
    int deleteByExample(CommodityType2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @Delete({
        "delete from commodity_type2",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @Insert({
        "insert into commodity_type2 (_id, type2_id, ",
        "type1_id, type2_name)",
        "values (#{id,jdbcType=INTEGER}, #{type2Id,jdbcType=INTEGER}, ",
        "#{type1Id,jdbcType=INTEGER}, #{type2Name,jdbcType=VARCHAR})"
    })
    int insert(CommodityType2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @InsertProvider(type=CommodityType2SqlProvider.class, method="insertSelective")
    int insertSelective(CommodityType2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @SelectProvider(type=CommodityType2SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type2_id", property="type2Id", jdbcType=JdbcType.INTEGER),
        @Result(column="type1_id", property="type1Id", jdbcType=JdbcType.INTEGER),
        @Result(column="type2_name", property="type2Name", jdbcType=JdbcType.VARCHAR)
    })
    List<CommodityType2> selectByExample(CommodityType2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CommodityType2SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CommodityType2 record, @Param("example") CommodityType2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CommodityType2SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CommodityType2 record, @Param("example") CommodityType2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CommodityType2SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CommodityType2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_type2
     *
     * @mbg.generated
     */
    @Update({
        "update commodity_type2",
        "set type2_id = #{type2Id,jdbcType=INTEGER},",
          "type1_id = #{type1Id,jdbcType=INTEGER},",
          "type2_name = #{type2Name,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommodityType2 record);
}