package com.epam.democonfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/config")
@RestController
public class DemoConfigClientController {

    @Value("${my.greetings}")
    private String message;

    @Value("${my.list.values}")
    private List<String> values;

    @Value("${something.else}")
    private String other;

    @GetMapping("/greetings")
    public ResponseEntity<String> getMessageProperty() {
        return ResponseEntity.ok(message);
    }

    @GetMapping("/values")
    public ResponseEntity<List<String>> getValuesProperty() {
        return ResponseEntity.ok(values);
    }

    @GetMapping("/others")
    public ResponseEntity<String> getOtherProperty() {
        return ResponseEntity.ok(other);
    }
}
