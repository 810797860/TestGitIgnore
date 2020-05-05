package com.otoko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2020/3/31.
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String toHello(){
        return "ccc";
    }

    @GetMapping("/hello2")
    public String toHello2(){
        return new Date().toString();
    }
}
