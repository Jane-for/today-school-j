package com.qingxun.pub.mission;


import com.qingxun.pub.generate.pojo.ViewMisAll;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
import java.util.Map;

public interface ViewAllMisDAO {

    @Select({
            "SELECT * FROM view_mis_all"
    })
    @Results({
            @Result(column="user_imgurl", property="userImgurl", jdbcType=JdbcType.VARCHAR),
            @Result(column="faqi_id", property="faqiId", jdbcType=JdbcType.INTEGER),
            @Result(column="mis_content", property="misContent", jdbcType=JdbcType.VARCHAR),
            @Result(column="mis_time1", property="misTime1", jdbcType=JdbcType.VARCHAR),
            @Result(column="mis_time2", property="misTime2", jdbcType=JdbcType.VARCHAR),
            @Result(column="mis_struts", property="misStruts", jdbcType=JdbcType.INTEGER),
            @Result(column="mis_xuqqnum", property="misXuqqnum", jdbcType=JdbcType.INTEGER),
            @Result(column="mis_money", property="misMoney", jdbcType=JdbcType.REAL),
            @Result(column="mis_tilte", property="misTilte", jdbcType=JdbcType.VARCHAR),
            @Result(column="mis_top", property="misTop", jdbcType=JdbcType.INTEGER),
            @Result(column="mis_id", property="misId", jdbcType=JdbcType.INTEGER)
    })
    List<ViewMisAll> getAllMis();



    ViewMisAll getMisById(int id);
}
