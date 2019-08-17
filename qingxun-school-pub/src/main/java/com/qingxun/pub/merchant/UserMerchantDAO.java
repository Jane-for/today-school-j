package com.qingxun.pub.merchant;

import com.qingxun.pub.generate.pojo.UserMerchant;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface UserMerchantDAO {
    @Select({
            "SELECT MAX(mer_id) FROM user_merchant"
    })
    int getMaxMerId();


    @Select({
            "SELECT\n" +
                    "CASE\n" +
                    "\t\t\n" +
                    "\tWHEN\n" +
                    "\t\tmerchant_id IS NULL THEN\n" +
                    "\t\t\t0 ELSE 1 \n" +
                    "\t\tEND merchant_id \n" +
                    "FROM\n" +
                    "\tuser_user \n" +
                    "WHERE\n" +
                    "\tuser_id = ${id}"
    })
    int ifUserPutMer(@Param("id") Integer id);

    @Select({
            "SELECT * FROM user_merchant WHERE mer_id = 5"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mer_id", property = "merId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mer_name", property = "merName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mer_info", property = "merInfo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mer_imgurl", property = "merImgurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mer_sturts", property = "merSturts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mer_phone", property = "merPhone", jdbcType = JdbcType.VARCHAR)
    })
    UserMerchant userGetMer(Integer userId);
}
