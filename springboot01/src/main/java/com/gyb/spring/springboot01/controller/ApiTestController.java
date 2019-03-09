package com.gyb.spring.springboot01.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiTestController {
    @GetMapping("/api/test")
    public void index(String callback ,HttpServletResponse response) throws Exception {
        //response.setHeader("Access-Control-Allow-Origin","*");
        HashMap<String, Object> map = new HashMap<>();
        map.put("hello","test");
        map.put("name","test");
        map.put("age",11);
        map.put("sex","f");
        Object o = JSON.toJSON(map);
        response.getWriter().write(callback+"("+ o +")");
    }

}
