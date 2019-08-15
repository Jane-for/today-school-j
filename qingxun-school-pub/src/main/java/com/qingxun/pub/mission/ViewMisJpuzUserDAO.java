package com.qingxun.pub.mission;

import com.qingxun.pub.generate.pojo.Mission;
import com.qingxun.pub.generate.pojo.ViewMisAll;
import com.qingxun.pub.generate.pojo.ViewMisJpuzUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ViewMisJpuzUserDAO {
    @Select({
            "SELECT * FROM view_mis_jpuz_user WHERE user_id = ${userId} AND jpuz_sturts = ${type}"
    })
    @Results({
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_time", property = "jpuzTime", jdbcType = JdbcType.VARCHAR),
            @Result(column = "jpuz_sturts", property = "jpuzSturts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "user_imgurl", property = "userImgurl", jdbcType = JdbcType.VARCHAR)
    })
    List<ViewMisJpuzUser> userGetMis(@Param("userId") Integer userId, @Param("type") String type);

    @Select({
            "SELECT * FROM view_mis_jpuz_user where user_id = ${userId}"
    })
    @Results({
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_time", property = "jpuzTime", jdbcType = JdbcType.VARCHAR),
            @Result(column = "jpuz_sturts", property = "jpuzSturts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "user_imgurl", property = "userImgurl", jdbcType = JdbcType.VARCHAR)
    })
    List<ViewMisJpuzUser> userGetMisList(@Param("userId") Integer userId);

    @Select({
            "SELECT * FROM view_mis_jpuz_user WHERE user_id = ${userId} AND jpuz_sturts = ${type}"
    })
    @Results({
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_time", property = "jpuzTime", jdbcType = JdbcType.VARCHAR),
            @Result(column = "jpuz_sturts", property = "jpuzSturts", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "user_imgurl", property = "userImgurl", jdbcType = JdbcType.VARCHAR)
    })
    ViewMisJpuzUser userGetMisInfoById(Integer userId);


    List<Mission> userGetFaBuMisList(Integer userId);
}
