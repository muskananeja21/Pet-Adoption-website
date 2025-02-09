package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooterController {

    @GetMapping("/footer")
    public String getFooterText() {
        return "&copy; 2024 PetAdopt | All Rights Reserved";
    }
}
