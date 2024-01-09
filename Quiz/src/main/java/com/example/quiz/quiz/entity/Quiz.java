package com.example.quiz.quiz.entity;

import com.example.quiz.question.entity.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Quiz {
    @Id
    private UUID id;
    private Integer score;
    @ManyToMany(mappedBy = "quizzes")
    private List<Question> questions;

}
