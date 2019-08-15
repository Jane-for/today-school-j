package com.qingxun.app.othapi.service;

import com.qingxun.pub.carousel.CarouselDAO;
import com.qingxun.pub.generate.pojo.AppCarousel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarouselService {

    final
    CarouselDAO carouselDAO;

    @Autowired
    public CarouselService(CarouselDAO carouselDAO) {
        this.carouselDAO = carouselDAO;
    }

    public Map<String, Object> getAll() {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put("reason", "请求成功");
        resultMap.put("resultcode", 200);


        List<AppCarousel> appCarouselList = carouselDAO.getAll();
        resultMap.put("result", appCarouselList);
        return resultMap;
    }
}
