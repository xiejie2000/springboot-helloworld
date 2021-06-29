package com.mayikt.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.mayikt.service")
public class HelloworldService {
    /**
     * restcontroller 返回jason格式
     * */
    @RequestMapping("/getUser")
    public String getUser(String b,String c) {
        int i = 0;
        int a = 1;

        for (i=0;i<10;i++){
            a = i;
        }
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloworldService.class,args);
    }
}

