package com.gyb.springboot.activemq01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @author gengyuanbo
 * 2019/03/09
 */
@Component
public class SendMess {
    @Autowired
    private JmsMessagingTemplate template;

    public void sendMess(String mess){
        template
                .convertAndSend("my_mess",mess);
    }
}
