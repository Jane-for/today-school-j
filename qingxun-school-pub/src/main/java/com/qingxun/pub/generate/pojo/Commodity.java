package com.qingxun.pub.generate.pojo;

public class Commodity {
    private Integer id;

    private Integer marId;

    private Integer comId;

    private String comName;

    private String comImgurl;

    private String comMoney;

    private Integer type1Id;

    private String comStruts;

    private Integer comTop;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarId() {
        return marId;
    }

    public void setMarId(Integer marId) {
        this.marId = marId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public String getComImgurl() {
        return comImgurl;
    }

    public void setComImgurl(String comImgurl) {
        this.comImgurl = comImgurl == null ? null : comImgurl.trim();
    }

    public String getComMoney() {
        return comMoney;
    }

    public void setComMoney(String comMoney) {
        this.comMoney = comMoney == null ? null : comMoney.trim();
    }

    public Integer getType1Id() {
        return type1Id;
    }

    public void setType1Id(Integer type1Id) {
        this.type1Id = type1Id;
    }

    public String getComStruts() {
        return comStruts;
    }

    public void setComStruts(String comStruts) {
        this.comStruts = comStruts == null ? null : comStruts.trim();
    }

    public Integer getComTop() {
        return comTop;
    }

    public void setComTop(Integer comTop) {
        this.comTop = comTop;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", marId=" + marId +
                ", comId=" + comId +
                ", comName='" + comName + '\'' +
                ", comImgurl='" + comImgurl + '\'' +
                ", comMoney='" + comMoney + '\'' +
                ", type1Id=" + type1Id +
                ", comStruts='" + comStruts + '\'' +
                ", comTop=" + comTop +
                '}';
    }
}