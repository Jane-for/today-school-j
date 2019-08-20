package com.qingxun.pub.merchant;

import com.qingxun.pub.generate.pojo.Commodity;
import com.qingxun.pub.generate.pojo.CommodityType1;
import com.qingxun.pub.generate.pojo.UserMerchant;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CommodityDAO {
    @Select({
            "SELECT * FROM commodity WHERE mar_id = ${merchantId}"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mar_id", property = "marId", jdbcType = JdbcType.INTEGER),
            @Result(column = "com_id", property = "comId", jdbcType = JdbcType.INTEGER),
            @Result(column = "com_name", property = "comName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "com_imgurl", property = "comImgurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "com_money", property = "comMoney", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type1_id", property = "type1Id", jdbcType = JdbcType.INTEGER),
            @Result(column = "com_struts", property = "comStruts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "com_top", property = "comTop", jdbcType = JdbcType.INTEGER)
    })
    List<Commodity> get(@Param("merchantId") Integer merchantId);

    @Select({
            "SELECT * FROM commodity_type1 WHERE mer_id= ${merchantId}"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "type1_id", property = "type1Id", jdbcType = JdbcType.INTEGER),
            @Result(column = "mer_id", property = "merId", jdbcType = JdbcType.INTEGER),
            @Result(column = "type1_name", property = "type1Name", jdbcType = JdbcType.VARCHAR)
    })
    List<CommodityType1> getType1(@Param("merchantId") Integer merchantId);

    @Select({
            "SELECT MAX(com_id) FROM commodity"
    })
    int getMaxComId();

    @Select({
            "SELECT * FROM commodity WHERE com_struts = 0 LIMIT 3 "
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mar_id", property = "marId", jdbcType = JdbcType.INTEGER),
            @Result(column = "com_id", property = "comId", jdbcType = JdbcType.INTEGER),
            @Result(column = "com_name", property = "comName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "com_imgurl", property = "comImgurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "com_money", property = "comMoney", jdbcType = JdbcType.VARCHAR),
            @Result(column = "type1_id", property = "type1Id", jdbcType = JdbcType.INTEGER),
            @Result(column = "com_struts", property = "comStruts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "com_top", property = "comTop", jdbcType = JdbcType.INTEGER)
    })
    List<Commodity> getNewCom();

    @Select({
            "SELECT * FROM user_merchant WHERE mer_sturts = 1 "
    })
    @Results({
            @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="mer_name", property="merName", jdbcType=JdbcType.VARCHAR),
            @Result(column="mer_info", property="merInfo", jdbcType=JdbcType.VARCHAR),
            @Result(column="mer_imgurl", property="merImgurl", jdbcType=JdbcType.VARCHAR),
            @Result(column="mer_sturts", property="merSturts", jdbcType=JdbcType.INTEGER),
            @Result(column="mer_phone", property="merPhone", jdbcType=JdbcType.VARCHAR)
    })
    List<UserMerchant> getNewMer();
}
