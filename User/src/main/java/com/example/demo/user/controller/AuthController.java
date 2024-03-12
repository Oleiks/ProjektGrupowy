package com.example.demo.user.controller;

import com.example.demo.user.config.UserAuthProvider;
import com.example.demo.user.dto.CredentialsDto;
import com.example.demo.user.dto.SignUpDto;
import com.example.demo.user.service.UserService;
import com.example.demo.user.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class AuthController {

    private final UserService userService;
    private final UserAuthProvider userAuthProvider;

    public AuthController(UserService userService, UserAuthProvider userAuthProvider) {
        this.userService = userService;
        this.userAuthProvider = userAuthProvider;
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody CredentialsDto credentialsDto) {
            UserDto user = userService.login(credentialsDto);
            user.setToken(userAuthProvider.createToken(user));
            return ResponseEntity.ok(user);
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody SignUpDto signUpDto) {
        UserDto user = userService.register(signUpDto);

        // if you don't want the user to be 'logged in' after the registration remove setting the token
        user.setToken(userAuthProvider.createToken(user));
        return ResponseEntity.created(URI.create("/users/" + user.getId())).body(user);
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello, world!";
    }

    @GetMapping("/current-user")
    public ResponseEntity<String> getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Object principal = authentication.getPrincipal();
        if (principal instanceof UserDto) {
            UserDto user = (UserDto) principal;
            return ResponseEntity.ok(user.getUsername()); // Assuming getUsername() method exists in UserDto
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid principal type");
        }
    }

}
