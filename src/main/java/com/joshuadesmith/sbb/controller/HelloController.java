package com.joshuadesmith.sbb.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Data
@RequiredArgsConstructor
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(@RequestParam(required = false, defaultValue = "Anonymous") String name) {
        return String.format("Hello, %s!", name);
    }
}