package com.day.isky.controller;

import com.day.isky.domain.MqMsg;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProducerController {
    @Autowired
    RocketMQTemplate template;

    @GetMapping("/sendStr")
    public void sendStr(String key) {
        log.info("key : {} is send to MQ ", key);
        try {
            template.getProducer().setVipChannelEnabled(false);
            template.syncSend("RLT_TEST_TOPIC", "Hello, World!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}