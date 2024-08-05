package com.example.domain.auth;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Tag(name = "Response Estimate", description = "Response Estimate API")
public class AuthController {
    @GetMapping("/login")
    @Operation(summary = "업체 로그인", description = "업체 측에서 로그인할 때 사용하는 API")
    public String login() {
        return "login-signup";
    }
    @GetMapping("/signup")
    @Operation(summary = "업체 회원가입", description = "업체 측에서 회원가입할 때 사용하는 API")
    public String signUp() {
        return "login-signup";
    }
}
