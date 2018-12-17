package com.gyb.spring.springboot01.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = "/")
    public  String index(){
        Log log = LogFactory.getLog(IndexController.class);
        log.warn("warning...........");
        return "index";
    }

}
