package com.zhezii.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/12
 */
@RestController
public class PrintController {

    @Value("${server.port}")
    private String port;

    //注入配置的上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/print/{message}")
    public String printMessage(@PathVariable("message") String message) {
        return "hello " + message + " i am from " + port + " and my name is " +
                applicationContext.getEnvironment().getProperty("user.name");
    }
}
