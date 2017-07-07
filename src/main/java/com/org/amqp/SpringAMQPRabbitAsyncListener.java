package com.org.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
public class SpringAMQPRabbitAsyncListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("Message [ " + new String(message.getBody()) +" ] received successfully.");
    }
}