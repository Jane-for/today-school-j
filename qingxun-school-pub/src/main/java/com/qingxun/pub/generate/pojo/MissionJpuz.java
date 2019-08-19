package com.qingxun.pub.generate.pojo;

public class MissionJpuz {
    private Integer id;

    private Integer jpuzId;

    private Integer userId;

    private String jpuzTime;

    private String jpuzSturts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJpuzId() {
        return jpuzId;
    }

    public void setJpuzId(Integer jpuzId) {
        this.jpuzId = jpuzId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getJpuzTime() {
        return jpuzTime;
    }

    public void setJpuzTime(String jpuzTime) {
        this.jpuzTime = jpuzTime == null ? null : jpuzTime.trim();
    }

    public String getJpuzSturts() {
        return jpuzSturts;
    }

    public void setJpuzSturts(String jpuzSturts) {
        this.jpuzSturts = jpuzSturts == null ? null : jpuzSturts.trim();
    }
}