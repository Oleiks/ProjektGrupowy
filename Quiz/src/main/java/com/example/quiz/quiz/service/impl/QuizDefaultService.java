package com.example.quiz.quiz.service.impl;

import com.example.quiz.quiz.entity.Quiz;
import com.example.quiz.quiz.repository.api.QuizRepository;
import com.example.quiz.quiz.service.api.QuizService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class QuizDefaultService implements QuizService {

    private final QuizRepository repository;

    public QuizDefaultService(QuizRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Quiz> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Quiz> find(UUID id) {
        return repository.findById(id);
    }

    @Override
    public void create(Quiz quiz) {
        repository.save(quiz);
    }

    @Override
    public void update(Quiz quiz) {
        repository.save(quiz);
    }

    @Override
    public void delete(UUID id) {
        repository.findById(id).ifPresent((repository::delete));
    }
}
