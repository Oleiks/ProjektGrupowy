package com.example.demo.Question.services;

import com.example.demo.Question.entities.Answer;
import com.example.demo.Question.entities.Question;
import com.example.demo.Question.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;
    @Autowired
    public AnswerService(AnswerRepository answerRepository){
        this.answerRepository=answerRepository;
    }
    public List<Answer> findAllByQuestion(Question question){
        return answerRepository.findAllByQuestion(question);
    }
    public Optional<Answer> find(UUID id){
        return answerRepository.findById(id);
    }
    public void saveAnswer(Answer answer){
        answerRepository.save(answer);
    }
    public void deleteAnswer(Answer answer){
        answerRepository.delete(answer);
    }
}
