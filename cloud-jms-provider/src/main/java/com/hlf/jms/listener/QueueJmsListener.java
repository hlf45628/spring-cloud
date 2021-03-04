package com.hlf.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueJmsListener {


    @JmsListener(destination ="${queueName}",containerFactory ="queveListener")
    public  void getQueueMessage(String message){
        System.out.println("Queue接收到消息="+message);
    }

    @JmsListener(destination ="${topicName}",containerFactory ="topicListener")
    public  void getTopicMessage(String message){
        System.out.println("TOPIC接收到消息="+message);
    }
}
