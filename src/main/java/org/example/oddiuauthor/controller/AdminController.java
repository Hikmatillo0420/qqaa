package org.example.oddiuauthor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping
    public String getAdmin(){
        return "Admin sahifasi";
    }
}
