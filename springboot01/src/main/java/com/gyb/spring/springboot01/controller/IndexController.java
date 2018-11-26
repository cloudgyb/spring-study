package com.gyb.spring.springboot01.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping(value = "/",produces = "application/json")
    public  String index(){
        Log log = LogFactory.getLog(IndexController.class);
        log.warn("warning...........");
        return "项目已启动！^-^---";
    }

}
