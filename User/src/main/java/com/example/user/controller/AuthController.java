package com.example.user.controller.impl;

import com.example.user.dto.CredentialsDto;
import com.example.user.dto.UserDto;
import com.example.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody CredentialsDto credentialsDto) {
            UserDto user = userService.login(credentialsDto);
            return ResponseEntity.ok(user);
    }

}
