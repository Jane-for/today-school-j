package com.qingxun.pub.generate.pojo;

import java.util.Date;

public class AppCarousel extends AppCarouselKey {
    private String carImgurl;

    private String carContent;

    private String carActivity;

    private Date carTime;

    public String getCarImgurl() {
        return carImgurl;
    }

    public void setCarImgurl(String carImgurl) {
        this.carImgurl = carImgurl == null ? null : carImgurl.trim();
    }

    public String getCarContent() {
        return carContent;
    }

    public void setCarContent(String carContent) {
        this.carContent = carContent == null ? null : carContent.trim();
    }

    public String getCarActivity() {
        return carActivity;
    }

    public void setCarActivity(String carActivity) {
        this.carActivity = carActivity == null ? null : carActivity.trim();
    }

    public Date getCarTime() {
        return carTime;
    }

    public void setCarTime(Date carTime) {
        this.carTime = carTime;
    }
}