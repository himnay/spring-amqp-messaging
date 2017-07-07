package com.org.amqp.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQPRabbitListener {
    private static final String RABBIT_CONTEXT_LISTENER = "springamqp-rabbit-listener-context.xml";

    public static void main(String...args) {
        // Initialize Spring IOC Container
        new ClassPathXmlApplicationContext(RABBIT_CONTEXT_LISTENER);
    }
}