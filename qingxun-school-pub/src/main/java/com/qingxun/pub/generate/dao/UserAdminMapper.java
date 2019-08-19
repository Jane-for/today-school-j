package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.UserAdmin;
import com.qingxun.pub.generate.pojo.UserAdminKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserAdminMapper {
    @Delete({
        "delete from user_admin",
        "where _id = #{id,jdbcType=INTEGER}",
          "and admin_id = #{adminId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(UserAdminKey key);

    @Insert({
        "insert into user_admin (_id, admin_id, ",
        "admin_login, admin_psd, ",
        "admin_name)",
        "values (#{id,jdbcType=INTEGER}, #{adminId,jdbcType=INTEGER}, ",
        "#{adminLogin,jdbcType=VARCHAR}, #{adminPsd,jdbcType=VARCHAR}, ",
        "#{adminName,jdbcType=VARCHAR})"
    })
    int insert(UserAdmin record);

    @InsertProvider(type=UserAdminSqlProvider.class, method="insertSelective")
    int insertSelective(UserAdmin record);

    @Select({
        "select",
        "_id, admin_id, admin_login, admin_psd, admin_name",
        "from user_admin",
        "where _id = #{id,jdbcType=INTEGER}",
          "and admin_id = #{adminId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="admin_login", property="adminLogin", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_psd", property="adminPsd", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_name", property="adminName", jdbcType=JdbcType.VARCHAR)
    })
    UserAdmin selectByPrimaryKey(UserAdminKey key);

    @UpdateProvider(type=UserAdminSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserAdmin record);

    @Update({
        "update user_admin",
        "set admin_login = #{adminLogin,jdbcType=VARCHAR},",
          "admin_psd = #{adminPsd,jdbcType=VARCHAR},",
          "admin_name = #{adminName,jdbcType=VARCHAR}",
        "where _id = #{id,jdbcType=INTEGER}",
          "and admin_id = #{adminId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserAdmin record);
}