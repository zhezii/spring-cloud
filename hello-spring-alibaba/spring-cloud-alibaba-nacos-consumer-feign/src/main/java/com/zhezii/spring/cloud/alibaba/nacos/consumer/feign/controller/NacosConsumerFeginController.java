package com.zhezii.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.zhezii.spring.cloud.alibaba.nacos.consumer.feign.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/14
 */
@RestController
public class NacosConsumerFeginController {

    @Autowired
    private PrintService printService;

    @GetMapping("/print/hi")
    public String print() {
        return printService.print("hello fegin");
    }
}
