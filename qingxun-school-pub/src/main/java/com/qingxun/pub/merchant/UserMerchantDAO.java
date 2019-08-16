package com.qingxun.pub.merchant;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
}
