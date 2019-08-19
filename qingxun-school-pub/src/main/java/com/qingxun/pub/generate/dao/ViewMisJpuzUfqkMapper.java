package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.ViewMisJpuzUfqk;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface ViewMisJpuzUfqkMapper {
    @Insert({
        "insert into view_mis_jpuz_ufqk (_id, faqi_id, ",
        "user_imgurl, mis_tilte, ",
        "jpuz_sturts, jpuz_time)",
        "values (#{id,jdbcType=INTEGER}, #{faqiId,jdbcType=INTEGER}, ",
        "#{userImgurl,jdbcType=VARCHAR}, #{misTilte,jdbcType=VARCHAR}, ",
        "#{jpuzSturts,jdbcType=VARCHAR}, #{jpuzTime,jdbcType=VARCHAR})"
    })
    int insert(ViewMisJpuzUfqk record);

    @InsertProvider(type=ViewMisJpuzUfqkSqlProvider.class, method="insertSelective")
    int insertSelective(ViewMisJpuzUfqk record);
}