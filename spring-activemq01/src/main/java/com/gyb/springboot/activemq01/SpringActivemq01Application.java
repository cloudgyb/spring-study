package com.gyb.springboot.activemq01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringActivemq01Application {
    @Autowired
    private SendMess sendMess;

    @GetMapping("/sendMess")
    public String sendMessTest(String mess){
        sendMess.sendMess(mess);
        return "已发送消息："+mess;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringActivemq01Application.class, args);
    }

}
