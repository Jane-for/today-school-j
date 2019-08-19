package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.AppCarousel;
import com.qingxun.pub.generate.pojo.AppCarouselKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AppCarouselMapper {
    @Delete({
        "delete from app_carousel",
        "where _id = #{id,jdbcType=INTEGER}",
          "and car_id = #{carId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(AppCarouselKey key);

    @Insert({
        "insert into app_carousel (_id, car_id, ",
        "car_imgurl, car_content, ",
        "car_activity, car_time)",
        "values (#{id,jdbcType=INTEGER}, #{carId,jdbcType=INTEGER}, ",
        "#{carImgurl,jdbcType=VARCHAR}, #{carContent,jdbcType=VARCHAR}, ",
        "#{carActivity,jdbcType=VARCHAR}, #{carTime,jdbcType=TIMESTAMP})"
    })
    int insert(AppCarousel record);

    @InsertProvider(type=AppCarouselSqlProvider.class, method="insertSelective")
    int insertSelective(AppCarousel record);

    @Select({
        "select",
        "_id, car_id, car_imgurl, car_content, car_activity, car_time",
        "from app_carousel",
        "where _id = #{id,jdbcType=INTEGER}",
          "and car_id = #{carId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="_id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_id", property="carId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="car_imgurl", property="carImgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_content", property="carContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_activity", property="carActivity", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_time", property="carTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AppCarousel selectByPrimaryKey(AppCarouselKey key);

    @UpdateProvider(type=AppCarouselSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AppCarousel record);

    @Update({
        "update app_carousel",
        "set car_imgurl = #{carImgurl,jdbcType=VARCHAR},",
          "car_content = #{carContent,jdbcType=VARCHAR},",
          "car_activity = #{carActivity,jdbcType=VARCHAR},",
          "car_time = #{carTime,jdbcType=TIMESTAMP}",
        "where _id = #{id,jdbcType=INTEGER}",
          "and car_id = #{carId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppCarousel record);
}