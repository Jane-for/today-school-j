package com.qingxun.pub.generate.pojo;

public class UserMerchant extends UserMerchantKey {
    private String merName;

    private String merInfo;

    private String merImgurl;

    private Integer merSturts;

    private String merPhone;

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
    }

    public String getMerInfo() {
        return merInfo;
    }

    public void setMerInfo(String merInfo) {
        this.merInfo = merInfo == null ? null : merInfo.trim();
    }

    public String getMerImgurl() {
        return merImgurl;
    }

    public void setMerImgurl(String merImgurl) {
        this.merImgurl = merImgurl == null ? null : merImgurl.trim();
    }

    public Integer getMerSturts() {
        return merSturts;
    }

    public void setMerSturts(Integer merSturts) {
        this.merSturts = merSturts;
    }

    public String getMerPhone() {
        return merPhone;
    }

    public void setMerPhone(String merPhone) {
        this.merPhone = merPhone == null ? null : merPhone.trim();
    }
}