package com.example.demo.user.controller;

import com.example.demo.user.dto.CredentialsDto;
import com.example.demo.user.dto.SignUpDto;
import com.example.demo.user.service.UserService;
import com.example.demo.user.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

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

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody SignUpDto signUpDto) {
        UserDto user = userService.register(signUpDto);
        return ResponseEntity.created(URI.create("/users/" + user.getId())).body(user);
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello, world!";
    }

}
