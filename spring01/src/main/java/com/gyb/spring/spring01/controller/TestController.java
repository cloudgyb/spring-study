package com.gyb.spring.spring01.controller;

import com.gyb.spring.spring01.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private TestService testService;
    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
        System.out.println("构造函数。。。。");
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/test1")
    @ResponseBody
    public String test1(){
        return "test1";
    }

    @GetMapping("/test2")
    @ResponseBody
    public String[] test2(){
        return new String[]{"123","456"};
    }
}
