package com.gyb.springboot.activemq01;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者，消费队列中的消息，通过@JmsListener监听目标队列
 * ，当有队列中有消息时，自动调用consume消费
 * @author gengyuanbo
 * 2019/03/12
 */
@Component
public class ConsumeMess {

    @JmsListener(destination = "my_mess")
    public void consume(String s){
        System.out.println("消费消息："+s);
    }
}
