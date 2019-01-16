package com.gyb.spring.springboot03.config;

import com.gyb.spring.springboot03.component.MyRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author gengyuanbo
 * 2019/01/16
 */

@Configuration
@ComponentScan
public class Springboot03Config {

    @Bean
    public MyRunner getMyRunner(){
        return new MyRunner();
    }

}
