package com.spring.dockertest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTest {

    @GetMapping("/")
    public String hello(){
        return "First Docker Test";
    }
}
