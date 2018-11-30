package com.gyb.spring.springboot01.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(value = "/api/user/1",produces = "application/json")
    public  String index(){
        return "项目已启动！^-^---";
    }

}
