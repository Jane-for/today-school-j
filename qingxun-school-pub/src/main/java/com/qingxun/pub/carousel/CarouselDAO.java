package com.qingxun.pub.carousel;

import com.qingxun.pub.generate.pojo.AppCarousel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CarouselDAO {
    @Select({
            "SELECT * FROM app_carousel"
    })
    @Results({
            @Result(column = "_id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "car_id", property = "carId", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "car_imgurl", property = "carImgurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "car_content", property = "carContent", jdbcType = JdbcType.VARCHAR),
            @Result(column = "car_activity", property = "carActivity", jdbcType = JdbcType.VARCHAR),
            @Result(column = "car_time", property = "carTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<AppCarousel> getAll();
}
