package com.gyb.spring.springactivemq02;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Topic;

/**
 * @author gengyuanbo
 * 2019/03/12
 */
@Component
public class Producer {
    @Autowired
    private JmsMessagingTemplate messagingTemplate;

    Topic topic = new ActiveMQTopic("my_topic");

    public void sendMess(String mess){
        //messagingTemplate.convertAndSend("my_topic",mess);
        messagingTemplate.convertAndSend(topic,mess);
    }
}
