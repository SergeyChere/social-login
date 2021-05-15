package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private StorageConfig storageConfig;

    @GetMapping("/cache")
    public Map<String, String> getCache() {
        return storageConfig.storage();
    }
}
