package com.gyb.spring.springsession01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@SpringBootApplication
@RestController
public class SpringSession01Application {

    @GetMapping("/")
    public String hello(HttpSession session){
        session.setAttribute("aaa","aaaaa");
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSession01Application.class, args);
    }

}

