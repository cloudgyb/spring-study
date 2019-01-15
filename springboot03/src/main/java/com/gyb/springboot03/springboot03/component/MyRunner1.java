package com.gyb.springboot03.springboot03.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author gengyuanbo
 * 2019/01/15
 */

@Component
@Order(1)
public class MyRunner1 implements CommandLineRunner {
    @Autowired
    private ApplicationConfig applicationConfig;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("myRunning1 run......");
        System.out.println(applicationConfig.toString());
    }
}
