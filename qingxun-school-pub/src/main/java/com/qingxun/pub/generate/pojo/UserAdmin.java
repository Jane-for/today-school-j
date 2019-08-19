package com.qingxun.pub.generate.pojo;

public class UserAdmin extends UserAdminKey {
    private String adminLogin;

    private String adminPsd;

    private String adminName;

    public String getAdminLogin() {
        return adminLogin;
    }

    public void setAdminLogin(String adminLogin) {
        this.adminLogin = adminLogin == null ? null : adminLogin.trim();
    }

    public String getAdminPsd() {
        return adminPsd;
    }

    public void setAdminPsd(String adminPsd) {
        this.adminPsd = adminPsd == null ? null : adminPsd.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }
}