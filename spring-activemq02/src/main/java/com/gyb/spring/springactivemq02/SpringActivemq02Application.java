package com.gyb.spring.springactivemq02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringActivemq02Application {
    @Autowired
    private Producer producer;
    @GetMapping("/sendMess")
    public String sendMess(String mess){
        producer.sendMess(mess);
        return "已经发送消息："+mess;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringActivemq02Application.class, args);
    }

}
