package com.gyb.spring.springsession01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
/*
@EnableConfigurationProperties
*/
@EnableTransactionManagement
public class Springboot05Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05Application.class, args);
    }

}

