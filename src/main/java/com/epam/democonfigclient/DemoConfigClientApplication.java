package com.epam.democonfigclient;

import com.epam.democonfigclient.config.ClientConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableConfigurationProperties(ClientConfig.class)
@SpringBootApplication
public class DemoConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigClientApplication.class, args);
    }
}
