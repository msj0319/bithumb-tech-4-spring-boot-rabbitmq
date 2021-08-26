package net.msj0319.api.consumer;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SampleListener {
    @RabbitListener(queues = "sample.queue")
    public void receiveMessage(final Message message) {
        System.out.println("####################");
        System.out.println(message.toString());
    }
}