package com.example.demo.Question.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AnswerDTO {
    private UUID id;
    private String content;
    private boolean isCorrect;
    private Long questionId;
}
