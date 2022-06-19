package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/detail")
@RestController
public class MyController {

    @RequestMapping("/product")
    public String product() {
        return "1.Apple 2.Orange";
    }

    @RequestMapping("/user")
    public String user() {
        return "Name is Sunny";
    }
}
