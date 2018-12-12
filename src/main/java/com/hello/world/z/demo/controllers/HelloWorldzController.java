package com.hello.world.z.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldzController {

    @GetMapping()
    public String getHelloWorldz() {
        return "Hello World Z";
    }
}
