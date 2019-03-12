package com.gyb.spring.springactivemq02;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author gengyuanbo
 * 2019/03/12
 */
@Component
public class Consumer {

    @JmsListener(destination = "my_topic")
    public void consume1(String mess){
        System.out.println("消费者1："+mess);
    }

    @JmsListener(destination = "my_topic")
    public void consume2(String mess){
        System.out.println("消费者2："+mess);
    }
}
