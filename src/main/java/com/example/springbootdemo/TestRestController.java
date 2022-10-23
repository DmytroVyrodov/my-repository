package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController()
public class TestRestController {
    @GetMapping("/hello")
    public List<String> hello() {
        return Arrays.asList("hello", "hello2");
    }


}
