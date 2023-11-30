package com.day.isky.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RocketMQMessageListener(topic = "RLT_TEST_TOPIC", consumerGroup = "my-group",enableMsgTrace = false)
public class MyListener implements RocketMQListener<String> {
    @Override
    public void onMessage(String key) {
        log.info("sssssssssssssssssssssssssssssssssssssssssssssssssssssss key : {} ", key);
    }
}
