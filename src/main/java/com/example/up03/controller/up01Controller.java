package com.example.up03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class up01Controller {
    @RequestMapping(value = "/hellow")
    @ResponseBody
    public String sayHello(){
        System.out.println("hello spring boot chapter");
        return "hello spring boot";
    }
}
