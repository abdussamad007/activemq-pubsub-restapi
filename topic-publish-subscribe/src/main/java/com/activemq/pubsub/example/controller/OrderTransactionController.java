package com.activemq.pubsub.example.controller;

import static com.activemq.pubsub.example.common.OrderConstant.ORDER_TOPIC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activemq.pubsub.example.domain.Order;

@RestController
@EnableAutoConfiguration
@RequestMapping("/transaction")
public class OrderTransactionController {
	
	@Autowired private JmsTemplate jmsTemplate;
	
	  @PostMapping("/send")
	  public void send(@RequestBody Order order) {
	    System.out.println("Sending a transaction.");
	    // Post message to the message queue named "OrderTransactionQueue"
	    jmsTemplate.convertAndSend(ORDER_TOPIC, order);
	  }

}
