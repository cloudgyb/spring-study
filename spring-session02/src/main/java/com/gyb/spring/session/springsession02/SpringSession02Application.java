package com.gyb.spring.session.springsession02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringSession02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSession02Application.class, args);
    }

}
