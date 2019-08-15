package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserUserOth;
import com.qingxun.pub.generate.pojo.UserUserOthExample;
import com.qingxun.pub.generate.pojo.UserUserOthKey;
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

public interface UserUserOthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @SelectProvider(type=UserUserOthSqlProvider.class, method="countByExample")
    long countByExample(UserUserOthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @DeleteProvider(type=UserUserOthSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserUserOthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @Delete({
        "delete from user_user_oth",
        "where _id = #{id,jdbcType=INTEGER}",
          "and oth_id = #{othId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(UserUserOthKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @Insert({
        "insert into user_user_oth (_id, oth_id, ",
        "oth_phone, oth_suue, ",
        "oth_school)",
        "values (#{id,jdbcType=INTEGER}, #{othId,jdbcType=INTEGER}, ",
        "#{othPhone,jdbcType=VARCHAR}, #{othSuue,jdbcType=VARCHAR}, ",
        "#{othSchool,jdbcType=VARCHAR})"
    })
    int insert(UserUserOth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @InsertProvider(type=UserUserOthSqlProvider.class, method="insertSelective")
    int insertSelective(UserUserOth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @SelectProvider(type=UserUserOthSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="oth_id", property="othId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="oth_phone", property="othPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="oth_suue", property="othSuue", jdbcType=JdbcType.VARCHAR),
        @Result(column="oth_school", property="othSchool", jdbcType=JdbcType.VARCHAR)
    })
    List<UserUserOth> selectByExample(UserUserOthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "_id, oth_id, oth_phone, oth_suue, oth_school",
        "from user_user_oth",
        "where _id = #{id,jdbcType=INTEGER}",
          "and oth_id = #{othId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="oth_id", property="othId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="oth_phone", property="othPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="oth_suue", property="othSuue", jdbcType=JdbcType.VARCHAR),
        @Result(column="oth_school", property="othSchool", jdbcType=JdbcType.VARCHAR)
    })
    UserUserOth selectByPrimaryKey(UserUserOthKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @UpdateProvider(type=UserUserOthSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserUserOth record, @Param("example") UserUserOthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @UpdateProvider(type=UserUserOthSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserUserOth record, @Param("example") UserUserOthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @UpdateProvider(type=UserUserOthSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserUserOth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_user_oth
     *
     * @mbg.generated
     */
    @Update({
        "update user_user_oth",
        "set oth_phone = #{othPhone,jdbcType=VARCHAR},",
          "oth_suue = #{othSuue,jdbcType=VARCHAR},",
          "oth_school = #{othSchool,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}",
          "and oth_id = #{othId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserUserOth record);
}