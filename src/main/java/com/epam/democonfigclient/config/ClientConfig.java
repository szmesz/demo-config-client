package com.epam.democonfigclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    @Value("${my.greetings}")
    private String message;

    @Value("${my.list.values}")
    private List<String> values;

    @Value("${something.else}")
    private String otherMessage;

    public String getMessage() {
        return message;
    }

    public List<String> getValues() {
        return values;
    }

    public String getOtherMessage() {
        return otherMessage;
    }
}
