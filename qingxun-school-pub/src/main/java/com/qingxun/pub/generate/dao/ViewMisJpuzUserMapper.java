package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.ViewMisJpuzUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface ViewMisJpuzUserMapper {
    @Insert({
        "insert into view_mis_jpuz_user (jpuz_id, user_id, ",
        "jpuz_time, jpuz_sturts, ",
        "mis_tilte, mis_content, ",
        "mis_time1, mis_time2, ",
        "mis_struts, mis_xuqqnum, ",
        "mis_money, user_imgurl)",
        "values (#{jpuzId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{jpuzTime,jdbcType=VARCHAR}, #{jpuzSturts,jdbcType=VARCHAR}, ",
        "#{misTilte,jdbcType=VARCHAR}, #{misContent,jdbcType=VARCHAR}, ",
        "#{misTime1,jdbcType=VARCHAR}, #{misTime2,jdbcType=VARCHAR}, ",
        "#{misStruts,jdbcType=INTEGER}, #{misXuqqnum,jdbcType=INTEGER}, ",
        "#{misMoney,jdbcType=REAL}, #{userImgurl,jdbcType=VARCHAR})"
    })
    int insert(ViewMisJpuzUser record);

    @InsertProvider(type=ViewMisJpuzUserSqlProvider.class, method="insertSelective")
    int insertSelective(ViewMisJpuzUser record);
}