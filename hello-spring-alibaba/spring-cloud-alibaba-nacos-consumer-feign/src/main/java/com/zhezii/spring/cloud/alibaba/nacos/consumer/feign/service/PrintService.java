package com.zhezii.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.zhezii.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.PrintServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/14
 */
@FeignClient(value = "nacos-provider",fallback = PrintServiceFallback.class)
public interface PrintService {

    @GetMapping("/print/{message}")
    String print(@PathVariable("message") String message);
}
