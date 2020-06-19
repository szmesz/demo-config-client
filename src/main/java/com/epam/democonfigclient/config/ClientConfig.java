package com.epam.democonfigclient.config;

import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    private String message;

    private List<Integer> values;

    private String otherMessage;

    public String getMessage() {
        return message;
    }

    public List<Integer> getValues() {
        return values;
    }

    public String getOtherMessage() {
        return otherMessage;
    }
}
