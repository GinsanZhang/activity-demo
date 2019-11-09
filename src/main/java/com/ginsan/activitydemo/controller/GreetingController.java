package com.ginsan.activitydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingController {
    @GetMapping("/message")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("hello world!");
    }

}
