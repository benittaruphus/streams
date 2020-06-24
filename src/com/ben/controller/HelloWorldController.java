package com.ben.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest")
public class HelloWorldController {

    @GetMapping("/ben")
    public String home() {
        System.out.println("Hello, World !!!");
        return "Hello, World !!!";
    }

    @PostMapping("/beni")
    public ResponseEntity home1() {
        System.out.println("Hello, World !!!");
        return new ResponseEntity(HttpStatus.OK);
    }
}