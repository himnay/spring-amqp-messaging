package com.org.amqp.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class SpringAMQPRabbitSender {
    private static final String RABBIT_CONTEXT_SENDER = "springamqp-rabbit-sender-context.xml";
    private static final String RABBIT_BROKER_TEMPLATE = "amqpTemplate";
    private static final String BINDING_KEY = "greet-hw-key";

    public static void main(String...args) throws Exception {
        final AmqpTemplate amqpTemplate = (AmqpTemplate)(new ClassPathXmlApplicationContext(RABBIT_CONTEXT_SENDER)).getBean(RABBIT_BROKER_TEMPLATE);
        int messageCount = 0;
        while (true){
            final String message = "Message " + messageCount++ ;
            amqpTemplate.convertAndSend(BINDING_KEY, message);
            System.out.println("Message [ " + message +" ] send successfully.");
            TimeUnit.SECONDS.sleep(2);
        }
    }
}