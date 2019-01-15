package com.gyb.springboot03.springboot03.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author gengyuanbo
 * 2019/01/15
 */

@Component
@Order(2)
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("myRunning run......");
        System.out.println(new ApplicationConfig().toString());
    }
}
