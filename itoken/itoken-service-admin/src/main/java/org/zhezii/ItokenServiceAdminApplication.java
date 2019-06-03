package org.zhezii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItokenServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItokenServiceAdminApplication.class, args);
    }

}
