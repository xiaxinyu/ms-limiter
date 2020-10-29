package com.sailfish.limiter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XIAXINYU3
 * @date 2020/10/29
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello sentinel";
    }
}
