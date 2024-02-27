package org.example.oddiuauthor.controller;

import lombok.RequiredArgsConstructor;
import org.example.oddiuauthor.Service.MyUserService;
import org.example.oddiuauthor.Service.UserService;
import org.example.oddiuauthor.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final MyUserService service;

    @PostMapping
    public User signup(@RequestBody User user){
        return service.create(user);
    }
}
