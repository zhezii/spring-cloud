package org.zhezii.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Zhou Wenzhe
 * @date 2019/5/18
 */
@Controller
@RequestMapping("/")
public class PrintController {

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @GetMapping(value = "/printName/{name}" )
    public String printName(@PathVariable("name") String name) {

        return "hi"+name+" i am from:"+port;
    }
}
