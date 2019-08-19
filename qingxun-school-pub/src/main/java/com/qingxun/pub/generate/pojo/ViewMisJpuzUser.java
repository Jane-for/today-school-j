package com.qingxun.pub.generate.pojo;

public class ViewMisJpuzUser {
    private Integer jpuzId;

    private Integer userId;

    private String jpuzTime;

    private String jpuzSturts;

    private String misTilte;

    private String misContent;

    private String misTime1;

    private String misTime2;

    private Integer misStruts;

    private Integer misXuqqnum;

    private Float misMoney;

    private String userImgurl;

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

    public String getMisTilte() {
        return misTilte;
    }

    public void setMisTilte(String misTilte) {
        this.misTilte = misTilte == null ? null : misTilte.trim();
    }

    public String getMisContent() {
        return misContent;
    }

    public void setMisContent(String misContent) {
        this.misContent = misContent == null ? null : misContent.trim();
    }

    public String getMisTime1() {
        return misTime1;
    }

    public void setMisTime1(String misTime1) {
        this.misTime1 = misTime1 == null ? null : misTime1.trim();
    }

    public String getMisTime2() {
        return misTime2;
    }

    public void setMisTime2(String misTime2) {
        this.misTime2 = misTime2 == null ? null : misTime2.trim();
    }

    public Integer getMisStruts() {
        return misStruts;
    }

    public void setMisStruts(Integer misStruts) {
        this.misStruts = misStruts;
    }

    public Integer getMisXuqqnum() {
        return misXuqqnum;
    }

    public void setMisXuqqnum(Integer misXuqqnum) {
        this.misXuqqnum = misXuqqnum;
    }

    public Float getMisMoney() {
        return misMoney;
    }

    public void setMisMoney(Float misMoney) {
        this.misMoney = misMoney;
    }

    public String getUserImgurl() {
        return userImgurl;
    }

    public void setUserImgurl(String userImgurl) {
        this.userImgurl = userImgurl == null ? null : userImgurl.trim();
    }
}