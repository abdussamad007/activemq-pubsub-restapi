package com.activemq.pubsub.example.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.activemq.pubsub.example.domain.Order;

import static com.activemq.pubsub.example.common.OrderConstant.ORDER_TOPIC;

import javax.jms.Session;

@Component
public class OrderConsumer2 {

    private static Logger log = LoggerFactory.getLogger(OrderConsumer2.class);

    @JmsListener(destination = ORDER_TOPIC, containerFactory = "topicListenerFactory")
    public void receiveTopicMessage(@Payload Order order,
                                    @Headers MessageHeaders headers,
                                    Message message,
                                    Session session) {

        log.info("received consumer2 ==============" + order + "============");
    }

}
