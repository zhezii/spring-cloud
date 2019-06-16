package com.zhezii.spring.cloud.alibaba.rocketmq.provider.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/16
 */
public interface MySource {

    @Output("output1")
    MessageChannel output1();

    @Output("output2")
    MessageChannel output2();
}
