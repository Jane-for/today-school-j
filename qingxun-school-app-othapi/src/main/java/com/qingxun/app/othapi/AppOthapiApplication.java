package com.qingxun.app.othapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.swing.*;


@ServletComponentScan
@SpringBootApplication
@MapperScan("com.qingxun.pub")
public class AppOthapiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {



        JEditorPane response = new JEditorPane();
        response.setContentType("application/json;charset=utf-8");
        SpringApplication.run(AppOthapiApplication.class, args);
    }

}
