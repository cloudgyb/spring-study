package com.gyb.spring.springcache01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCache01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCache01Application.class, args);
    }

}
