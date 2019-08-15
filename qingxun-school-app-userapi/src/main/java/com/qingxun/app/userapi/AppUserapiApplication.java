package com.qingxun.app.userapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.swing.*;


@ServletComponentScan
@SpringBootApplication
@MapperScan("com.qingxun.pub.generate.dao")
@MapperScan("com.qingxun.pub.user")
public class AppUserapiApplication {

    public static void main(String[] args) {


        JEditorPane response = new JEditorPane();
        response.setContentType("application/json;charset=utf-8");
        SpringApplication.run(AppUserapiApplication.class, args);
    }

}
