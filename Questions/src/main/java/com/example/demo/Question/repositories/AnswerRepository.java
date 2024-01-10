package com.example.demo.Question.repositories;

import com.example.demo.Question.entities.Answer;
import com.example.demo.Question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, UUID> {
    public List<Answer> findAllByQuestion(Question question);
}
