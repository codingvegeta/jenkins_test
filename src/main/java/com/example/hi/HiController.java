package com.example.hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @GetMapping("/")
    public String hi() {
        return "Hello World";
    }

    @GetMapping("/hi")
    public String hello() {
        return "Hi World";
    }
}
