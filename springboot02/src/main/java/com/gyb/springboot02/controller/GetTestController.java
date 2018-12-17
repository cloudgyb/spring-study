package com.gyb.springboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetTestController {

    @GetMapping("/getTest")
    public Object testGetPrarms(@RequestParam String param){
        System.out.println(param);
        return "{\"mess\":\"ok!\"}";
    }
}
