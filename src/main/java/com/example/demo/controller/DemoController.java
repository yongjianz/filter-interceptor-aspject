package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/test")
    public String demo(){
        System.out.println("进入demo方法");
       //throw new IllegalArgumentException("抛出异常");
       // int i = 5/0;
        return "hello demo";
    }
}
