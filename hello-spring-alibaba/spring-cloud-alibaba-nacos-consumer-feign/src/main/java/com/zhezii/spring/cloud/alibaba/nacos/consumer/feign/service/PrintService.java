package com.zhezii.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/14
 */
@FeignClient("nacos-provider")
public interface PrintService {

    @GetMapping("/print/{message}")
    String print(@PathVariable("message") String message);
}
