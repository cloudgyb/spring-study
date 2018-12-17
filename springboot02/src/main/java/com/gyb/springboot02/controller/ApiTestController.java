package com.gyb.springboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiTestController {

    @GetMapping("/test")
    public Map test(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("hello","test");
        map.put("age",13);
        map.put("sex",'f');
        return map;
    }
}
