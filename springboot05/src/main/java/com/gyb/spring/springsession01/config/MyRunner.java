package com.gyb.spring.springsession01.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @author gengyuanbo
 * 2019/01/22
 */
public class MyRunner implements CommandLineRunner {
    private MyProperties myProperties;

    @Autowired
    public MyRunner(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    @Override
    public void run(String... args) throws Exception {
        Class.forName(myProperties.getDriverClassName());
    }
}
