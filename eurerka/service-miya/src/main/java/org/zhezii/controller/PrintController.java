package org.zhezii.controller;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author Zhou Wenzhe
 * @date 2019/5/20
 */
@RequestMapping("/")
@Controller
public class PrintController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String home() {
        return "hi i'm miya";
    }

    @RequestMapping("/miya")
    @ResponseBody
    public String info() {
        return restTemplate.getForObject("http://localhost:8898/info", String.class);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
