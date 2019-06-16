package com.zhezii.spring.cloud.alibaba.rocketmq.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/16
 */
public class ProviderService {

    @Autowired
    private MessageChannel output;

    @Autowired
    private MySource source;

    public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
        source.output1().send(MessageBuilder.withPayload(message).build());
    }
}
