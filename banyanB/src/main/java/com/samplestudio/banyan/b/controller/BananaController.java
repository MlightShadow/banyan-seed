package com.samplestudio.banyan.b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping("/api")
public class BananaController {
    @GetMapping("test")
    @ResponseBody
    public String test() {
        return "hello";
    }
}