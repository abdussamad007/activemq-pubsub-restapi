package com.activemq.pubsub.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.activemq.pubsub.example.clients.OrderSender;
import com.activemq.pubsub.example.domain.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
