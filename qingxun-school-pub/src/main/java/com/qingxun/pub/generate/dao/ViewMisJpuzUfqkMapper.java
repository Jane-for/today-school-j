package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.ViewMisJpuzUfqk;
import com.qingxun.pub.generate.pojo.ViewMisJpuzUfqkExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ViewMisJpuzUfqkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_mis_jpuz_ufqk
     *
     * @mbg.generated
     */
    @SelectProvider(type=ViewMisJpuzUfqkSqlProvider.class, method="countByExample")
    long countByExample(ViewMisJpuzUfqkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_mis_jpuz_ufqk
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ViewMisJpuzUfqkSqlProvider.class, method="deleteByExample")
    int deleteByExample(ViewMisJpuzUfqkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_mis_jpuz_ufqk
     *
     * @mbg.generated
     */
    @Insert({
        "insert into view_mis_jpuz_ufqk (_id, faqi_id, ",
        "user_imgurl, mis_tilte, ",
        "jpuz_sturts, jpuz_time)",
        "values (#{id,jdbcType=INTEGER}, #{faqiId,jdbcType=INTEGER}, ",
        "#{userImgurl,jdbcType=VARCHAR}, #{misTilte,jdbcType=VARCHAR}, ",
        "#{jpuzSturts,jdbcType=VARCHAR}, #{jpuzTime,jdbcType=VARCHAR})"
    })
    int insert(ViewMisJpuzUfqk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_mis_jpuz_ufqk
     *
     * @mbg.generated
     */
    @InsertProvider(type=ViewMisJpuzUfqkSqlProvider.class, method="insertSelective")
    int insertSelective(ViewMisJpuzUfqk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_mis_jpuz_ufqk
     *
     * @mbg.generated
     */
    @SelectProvider(type=ViewMisJpuzUfqkSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="faqi_id", property="faqiId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_imgurl", property="userImgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mis_tilte", property="misTilte", jdbcType=JdbcType.VARCHAR),
        @Result(column="jpuz_sturts", property="jpuzSturts", jdbcType=JdbcType.VARCHAR),
        @Result(column="jpuz_time", property="jpuzTime", jdbcType=JdbcType.VARCHAR)
    })
    List<ViewMisJpuzUfqk> selectByExample(ViewMisJpuzUfqkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_mis_jpuz_ufqk
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ViewMisJpuzUfqkSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ViewMisJpuzUfqk record, @Param("example") ViewMisJpuzUfqkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_mis_jpuz_ufqk
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ViewMisJpuzUfqkSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ViewMisJpuzUfqk record, @Param("example") ViewMisJpuzUfqkExample example);
}