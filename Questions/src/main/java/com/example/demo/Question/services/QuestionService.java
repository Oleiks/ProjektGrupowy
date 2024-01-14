package com.example.demo.Question.services;

import com.example.demo.Question.entities.Question;
import com.example.demo.Question.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    @Autowired
    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository=questionRepository;
    }
    public void saveQuestion (Question question){
        questionRepository.save(question);
    }
    public void deleteQuestion(Question question){
        questionRepository.delete(question);
    }
    public Optional<Question> find(Long id){
        return questionRepository.findById(id);
    }
    public List<Question> findAll(){
        return questionRepository.findAll();
    }
}
