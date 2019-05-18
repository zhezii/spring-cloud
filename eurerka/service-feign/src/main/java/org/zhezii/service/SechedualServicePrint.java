package org.zhezii.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Zhou Wenzhe
 * @date 2019/5/18
 */
@FeignClient(value = "eureka-client")
public interface SechedualServicePrint {

    @GetMapping(value = "/printName/{name}")
    String pringName(@PathVariable("name") String name);
}
