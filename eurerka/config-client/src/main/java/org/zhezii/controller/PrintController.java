package org.zhezii.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Zhou Wenzhe
 * @date 2019/5/19
 */
@RequestMapping("/")
@Controller
public class PrintController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/print")
    @ResponseBody
    public String print() {
        return foo;
    }
}
