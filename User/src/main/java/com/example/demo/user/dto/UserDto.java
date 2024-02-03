package com.example.demo.user.dto;

import lombok.*;

import java.util.UUID;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class UserDto {

    private UUID id;
    private String login;
    private String firstName;
    private String lastName;
    private String token;

}
