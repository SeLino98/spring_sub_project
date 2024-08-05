package com.example.domain.main;

import com.example.global.util.BaseResponse;
import com.example.global.util.BaseResponseBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<BaseResponseBody<Void>>  home(Model model) {
        model.addAttribute("message", "Welcome to the temporary page!");
        return ResponseEntity.ok(BaseResponseBody.of("200",null));

    }
}

