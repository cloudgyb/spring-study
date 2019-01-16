package com.gyb.spring.spring04;

import com.gyb.spring.springboot03.annotation.EnableSpringboot03;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSpringboot03
/*@ComponentScan("com.gyb.spring.springboot03")*/
public class Spring04Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring04Application.class, args);
    }

}

