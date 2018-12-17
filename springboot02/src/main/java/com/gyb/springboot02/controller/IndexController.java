package com.gyb.springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/a1")
    public  String aa(){
        return "1";
    }


    @GetMapping("/")
    public String index(){
        return "index";
    }



}
