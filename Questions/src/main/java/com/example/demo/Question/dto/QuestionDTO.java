package com.example.demo.Question.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class QuestionDTO {
    private Long id;
    private String content;
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @EqualsAndHashCode
    public static class Answer{
        private String answer;
        private boolean isCorrect;
    }
    private List<Answer> answers;
}
