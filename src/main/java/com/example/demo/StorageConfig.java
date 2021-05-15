package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class StorageConfig {

    Map<String, String> stringMap = new HashMap<>();

    @Bean
    public Map<String, String> storage() {
        return stringMap;
    }
}
