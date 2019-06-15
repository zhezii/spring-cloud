package com.zhezii.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.zhezii.spring.cloud.alibaba.nacos.consumer.feign.service.PrintService;
import org.springframework.stereotype.Component;

/**
 * @author Zhou Wenzhe
 * @date 2019/6/15
 */
@Component
public class PrintServiceFallback implements PrintService {
    @Override
    public String print(String message) {
        return "print fallback";
    }
}
