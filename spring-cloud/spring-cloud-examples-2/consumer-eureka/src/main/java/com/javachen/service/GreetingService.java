package com.javachen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {
    private String REST_URL_PREFIX = "PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    public String greeting(String username) {
        return restTemplate.getForObject("http://" + REST_URL_PREFIX + "/greeting/{username}", String.class, username);
    }
}
