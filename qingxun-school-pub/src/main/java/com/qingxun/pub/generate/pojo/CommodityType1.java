package com.qingxun.pub.generate.pojo;

public class CommodityType1 {
    private Integer id;

    private Integer merId;

    private String type1Name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public String getType1Name() {
        return type1Name;
    }

    public void setType1Name(String type1Name) {
        this.type1Name = type1Name == null ? null : type1Name.trim();
    }
}