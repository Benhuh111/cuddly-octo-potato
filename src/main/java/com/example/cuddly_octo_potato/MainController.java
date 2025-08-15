package com.example.cuddly_octo_potato;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getHome() {
        return "Welcome home";
    }
}
