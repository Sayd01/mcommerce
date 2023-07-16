package com.clientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients("com.clientui")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class ClientUiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientUiApplication.class, args);
    }

}
