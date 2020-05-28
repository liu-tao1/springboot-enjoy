package com.enjoy.mq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/5/18
 */
@Component
public class CartEventProducer implements CommandLineRunner {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void run(String... args) throws Exception {
        rocketMQTemplate.convertAndSend("cart-item-add-topic-2", new CartItemEvent("bike", 1));
        rocketMQTemplate.convertAndSend("cart-item-add-topic-2", new CartItemEvent("computer", 2));
        rocketMQTemplate.convertAndSend("cart-item-removed-topic-2", new CartItemEvent("bike", 1));
    }
}

