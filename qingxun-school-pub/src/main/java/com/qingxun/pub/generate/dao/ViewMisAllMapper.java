package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.ViewMisAll;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface ViewMisAllMapper {
    @Insert({
        "insert into view_mis_all (user_imgurl, faqi_id, ",
        "mis_content, mis_time1, ",
        "mis_time2, mis_struts, ",
        "mis_xuqqnum, mis_money, ",
        "mis_tilte, mis_top, ",
        "mis_id)",
        "values (#{userImgurl,jdbcType=VARCHAR}, #{faqiId,jdbcType=INTEGER}, ",
        "#{misContent,jdbcType=VARCHAR}, #{misTime1,jdbcType=VARCHAR}, ",
        "#{misTime2,jdbcType=VARCHAR}, #{misStruts,jdbcType=INTEGER}, ",
        "#{misXuqqnum,jdbcType=INTEGER}, #{misMoney,jdbcType=REAL}, ",
        "#{misTilte,jdbcType=VARCHAR}, #{misTop,jdbcType=INTEGER}, ",
        "#{misId,jdbcType=INTEGER})"
    })
    int insert(ViewMisAll record);

    @InsertProvider(type=ViewMisAllSqlProvider.class, method="insertSelective")
    int insertSelective(ViewMisAll record);
}