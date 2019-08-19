package com.qingxun.pub.generate.pojo;

public class UserUserOth extends UserUserOthKey {
    private String othPhone;

    private String othSuue;

    private String othSchool;

    private Integer userId;

    private String othName;

    public String getOthPhone() {
        return othPhone;
    }

    public void setOthPhone(String othPhone) {
        this.othPhone = othPhone == null ? null : othPhone.trim();
    }

    public String getOthSuue() {
        return othSuue;
    }

    public void setOthSuue(String othSuue) {
        this.othSuue = othSuue == null ? null : othSuue.trim();
    }

    public String getOthSchool() {
        return othSchool;
    }

    public void setOthSchool(String othSchool) {
        this.othSchool = othSchool == null ? null : othSchool.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOthName() {
        return othName;
    }

    public void setOthName(String othName) {
        this.othName = othName == null ? null : othName.trim();
    }
}