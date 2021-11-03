package com.jldevs.ejemplos.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloDocker(){
        return ResponseEntity.ok("hello docker");
    }
}
