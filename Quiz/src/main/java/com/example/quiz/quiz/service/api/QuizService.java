package com.example.quiz.quiz.service.api;

import com.example.quiz.quiz.entity.Quiz;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface QuizService {

    List<Quiz> findAll();
    Optional<Quiz> find(UUID id);
    void create(Quiz quiz);
    void update(Quiz quiz);
    void delete(UUID id);

}
