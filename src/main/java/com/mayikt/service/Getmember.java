package com.mayikt.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Getmember {
    @RequestMapping("/getMember")
    public String getMember() {

        return "getmember";
    }
}
