package com.example.demo.Question.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "odpowiedzi")
public class Answer {
    @Id
    private UUID id;
    private String content;
    private boolean isCorrect;
    @ManyToOne
    @JoinColumn(name = "question")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Question question;
}
