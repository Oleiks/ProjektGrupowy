package com.example.ranking.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.util.Comparator;
import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserDTO{
    private String firstName;
    private String lastName;
    private int score;
}
