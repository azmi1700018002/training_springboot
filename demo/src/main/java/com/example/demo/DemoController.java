package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Controller code goes here
    @GetMapping("/cek-demo")
    public String cekDemo() {
        return "Hallo Azmi, Demo is working!";
    }
    
}