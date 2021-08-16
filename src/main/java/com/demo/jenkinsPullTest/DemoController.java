package com.demo.jenkinsPullTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String health_check(){
        return "health_check";
    }
}
