package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String login() {
        return "login-signup";
    }
    @GetMapping("/signup")
    public String signUp() {
        return "login-signup";
    }
}
