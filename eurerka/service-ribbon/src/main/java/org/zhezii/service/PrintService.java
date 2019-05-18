package org.zhezii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Zhou Wenzhe
 * @date 2019/5/18
 */
@Service
public class PrintService {

    @Autowired
    private RestTemplate restTemplate;

    public String pringName(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/printName/" + name, String.class);
    }
}
