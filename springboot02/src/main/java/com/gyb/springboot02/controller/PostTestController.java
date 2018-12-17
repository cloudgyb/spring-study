package com.gyb.springboot02.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostTestController {
    @GetMapping("/getTest")
    public Object testGetPrarms(@RequestParam String param){
        System.out.println(param);
        return "{\"mess\":\"ok!\"}";
    }

    @PostMapping("/postTest")
    public Object testGetParams(HttpServletRequest req,@RequestParam String p2){
        String param = req.getParameter("param");
        System.out.println(param);
        System.out.println(p2);
        return "{\"mess\":\"ok!\"}";
    }

    @PutMapping("/putTest")
    public Map testPut(@RequestParam String param){
        System.out.println(param);
        HashMap<String, Object> map = new HashMap<>();
        map.put("mess","ok!");
        return map;
    }

    @DeleteMapping("/deleteTest")
    public Map testDelete(@RequestParam String id){
        System.out.println(id);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("mess","ok!");
        return map;
    }
}
