package com.example.quiz.question.entity;

import com.example.quiz.answer.entity.Answer;
import com.example.quiz.quiz.entity.Quiz;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@Entity
public class Question {
    @Id
    private Long id;
    private String content;
    @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Answer> answers;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })  // TODO: check imports if they are fine
    private List<Quiz> quizzes;
}
