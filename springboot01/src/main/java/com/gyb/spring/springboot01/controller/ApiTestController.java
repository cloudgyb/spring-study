package com.gyb.spring.springboot01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiTestController {
    @GetMapping("/api/test")
    public Map index(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("hello","test");
        map.put("name","test");
        map.put("age",11);
        map.put("sex","f");
        return map;
    }

}
