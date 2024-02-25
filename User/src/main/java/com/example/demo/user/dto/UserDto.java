package com.example.demo.user.dto;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private UUID id;
    private String firstName;
    private String lastName;
    private String login;
    private String token;

}
