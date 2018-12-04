package com.gyb.spring.security03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "Hello Spring Security03!";
    }

    @GetMapping(value = "/hello",produces = "text/html;charset=utf-8")
    public String hello(){
        return "哈喽 Spring Security03!";
    }

    @GetMapping("/test")
    public Map test(){
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("hello","哈喽");
        return stringObjectHashMap;
    }
}
