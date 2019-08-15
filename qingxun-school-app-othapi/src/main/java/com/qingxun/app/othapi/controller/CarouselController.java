package com.qingxun.app.othapi.controller;

import com.qingxun.app.othapi.service.CarouselService;
import com.qingxun.app.userapi.token.PassToken;
import com.sun.javafx.collections.MappingChange;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping(value = "carousel")
@RestController
public class CarouselController {
    private final
    CarouselService carouselService;

    @Autowired
    public CarouselController(CarouselService carouselService) {
        this.carouselService = carouselService;
    }

    @PassToken
    @RequestMapping("getAll")
    public Map<String,Object> getAll(){
        return carouselService.getAll();
    }
}
