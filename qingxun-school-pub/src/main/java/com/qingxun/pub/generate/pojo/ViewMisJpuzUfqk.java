package com.qingxun.pub.generate.pojo;

public class ViewMisJpuzUfqk {
    private Integer id;

    private Integer faqiId;

    private String userImgurl;

    private String misTilte;

    private String jpuzSturts;

    private String jpuzTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFaqiId() {
        return faqiId;
    }

    public void setFaqiId(Integer faqiId) {
        this.faqiId = faqiId;
    }

    public String getUserImgurl() {
        return userImgurl;
    }

    public void setUserImgurl(String userImgurl) {
        this.userImgurl = userImgurl == null ? null : userImgurl.trim();
    }

    public String getMisTilte() {
        return misTilte;
    }

    public void setMisTilte(String misTilte) {
        this.misTilte = misTilte == null ? null : misTilte.trim();
    }

    public String getJpuzSturts() {
        return jpuzSturts;
    }

    public void setJpuzSturts(String jpuzSturts) {
        this.jpuzSturts = jpuzSturts == null ? null : jpuzSturts.trim();
    }

    public String getJpuzTime() {
        return jpuzTime;
    }

    public void setJpuzTime(String jpuzTime) {
        this.jpuzTime = jpuzTime == null ? null : jpuzTime.trim();
    }
}