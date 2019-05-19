package org.zhezii.service.impl;

import org.springframework.stereotype.Component;
import org.zhezii.service.SechedualServicePrint;

/**
 * @author Zhou Wenzhe
 * @date 2019/5/19
 */
@Component
public class SechedualServicePrintHystric implements SechedualServicePrint {
    @Override
    public String pringName(String name) {
        return "sorry "+name;
    }
}
