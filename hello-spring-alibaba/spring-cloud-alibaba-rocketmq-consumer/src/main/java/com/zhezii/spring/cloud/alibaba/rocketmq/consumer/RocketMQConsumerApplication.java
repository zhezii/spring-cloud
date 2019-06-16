package com.zhezii.spring.cloud.alibaba.rocketmq.consumer;

import com.zhezii.spring.cloud.alibaba.rocketmq.consumer.service.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/16
 */
@SpringBootApplication
@EnableBinding({Sink.class, MySink.class})
public class RocketMQConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketMQConsumerApplication.class, args);
    }
}
