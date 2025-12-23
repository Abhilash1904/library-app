package com.example.libraryApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomePage {

    @GetMapping("home")
    public String test(){
        return "from test controller";
    }
}
