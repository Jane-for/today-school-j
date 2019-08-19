package com.qingxun.pub.generate.pojo;

public class CommodityType2 {
    private Integer id;

    private Integer type2Id;

    private Integer type1Id;

    private String type2Name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType2Id() {
        return type2Id;
    }

    public void setType2Id(Integer type2Id) {
        this.type2Id = type2Id;
    }

    public Integer getType1Id() {
        return type1Id;
    }

    public void setType1Id(Integer type1Id) {
        this.type1Id = type1Id;
    }

    public String getType2Name() {
        return type2Name;
    }

    public void setType2Name(String type2Name) {
        this.type2Name = type2Name == null ? null : type2Name.trim();
    }
}