package com.javachen.controller;

import com.javachen.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/greeting/{username}")
    public String getGreeting(@PathVariable("username") String username) {
        return greetingService.greeting(username);
    }
}
