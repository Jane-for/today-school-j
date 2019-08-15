package com.qingxun.pub.mission;

import com.qingxun.pub.generate.pojo.Mission;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface MissionDAO {
    @Select({
            "select * ",
            "from mission"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mis_id", property = "misId", jdbcType = JdbcType.INTEGER),
            @Result(column = "faqi_id", property = "faqiId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "mis_top", property = "misTop", jdbcType = JdbcType.INTEGER)
    })
    List<Mission> getAllMis();

    @Select({
            "SELECT MAX(_id) FROM mission"
    })
    int getMax_id();

    @Select({
            "SELECT MAX(mis_id) FROM mission"
    })
    int getMaxMisid();

    @Select({
            "SELECT\n" +
                    "\t* \n" +
                    "FROM\n" +
                    "\tmission \n" +
                    "WHERE\n" +
                    "\tmis_id = ${id}"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mis_id", property = "misId", jdbcType = JdbcType.INTEGER),
            @Result(column = "faqi_id", property = "faqiId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "mis_top", property = "misTop", jdbcType = JdbcType.INTEGER)
    })
    Mission getMisByMisId(@Param("id") int id);

    @Select({
            "SELECT\n" +
                    "\t* \n" +
                    "FROM\n" +
                    "\tmission \n" +
                    "WHERE\n" +
                    "\tjpuz_id = ${id}"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mis_id", property = "misId", jdbcType = JdbcType.INTEGER),
            @Result(column = "faqi_id", property = "faqiId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "mis_top", property = "misTop", jdbcType = JdbcType.INTEGER)
    })
    List<Mission> getMisLisyByUserId(@Param("id") Integer userId);

    @Select({
            "SELECT MAX(jpuz_id) FROM mission"
    })
    int getMaxJpuzid();

    @Select({
            "SELECT COUNT(*) FROM mission_jpuz WHERE jpuz_id = ${jpuzId}"
    })
    int getJpUzNumByJpUzId(@Param("jpuzId") String jpuzId);


    @Insert({
            "INSERT INTO `qingxun_school`.`mission_jpuz`(`jpuz_id`, `user_id`, `jpuz_time`, `jpuz_sturts`) VALUES (${jpuz_id}, ${user_id}, '${jpuz_time}', '${jpuz_sturts}')"
    })
    int userPutMis(@Param("user_id") Integer userId, @Param("jpuz_id") String misId, @Param("jpuz_time") String jpuz_time, @Param("jpuz_sturts") String jpuz_sturts);

    @Select({
            "SELECT\n" +
                    "\t* \n" +
                    "FROM\n" +
                    "\tmission \n" +
                    "WHERE\n" +
                    "\tfaqi_id = ${id}"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mis_id", property = "misId", jdbcType = JdbcType.INTEGER),
            @Result(column = "faqi_id", property = "faqiId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "mis_top", property = "misTop", jdbcType = JdbcType.INTEGER)
    })
    List<Mission> userGetFaBuMisList(@Param("id") Integer userId);

    @Select({
            "SELECT\n" +
                    "\t* \n" +
                    "FROM\n" +
                    "\tmission \n" +
                    "WHERE\n" +
                    "\tfaqi_id = ${id} and mis_struts = ${mis_struts} "
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "mis_id", property = "misId", jdbcType = JdbcType.INTEGER),
            @Result(column = "faqi_id", property = "faqiId", jdbcType = JdbcType.INTEGER),
            @Result(column = "jpuz_id", property = "jpuzId", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_tilte", property = "misTilte", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_content", property = "misContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time1", property = "misTime1", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_time2", property = "misTime2", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mis_struts", property = "misStruts", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_xuqqnum", property = "misXuqqnum", jdbcType = JdbcType.INTEGER),
            @Result(column = "mis_money", property = "misMoney", jdbcType = JdbcType.REAL),
            @Result(column = "mis_top", property = "misTop", jdbcType = JdbcType.INTEGER)
    })
    List<Mission> userGetFaBuMisListType(@Param("id") Integer userId, @Param("mis_struts") String type);
}
