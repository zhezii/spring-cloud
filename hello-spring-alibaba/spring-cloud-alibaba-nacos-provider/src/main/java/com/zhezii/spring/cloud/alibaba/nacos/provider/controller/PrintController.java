package com.zhezii.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/12
 */
@RestController
public class PrintController {

    @GetMapping("/print/{message}")
    public String printMessage(@PathVariable("message") String message) {
        return "hello nacos!print: "+message;
    }
}
