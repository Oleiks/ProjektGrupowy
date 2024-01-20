package com.example.demo.Question.services;

import com.example.demo.Question.entities.Question;
import com.example.demo.Question.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    public List<Question> GetRandomQuestions(int numberOfQuestions){
        List<Question> allQuestions = questionRepository.findAll();
        Set<Long> selectedQuestionIds = new HashSet<>();
        Random random = new Random();
        List<Question> randomQuestions = new ArrayList<>();
        while (randomQuestions.size() < numberOfQuestions) {
            int randomIndex = random.nextInt(allQuestions.size());
            Question selectedQuestion = allQuestions.get(randomIndex);

            if (!selectedQuestionIds.contains(selectedQuestion.getId())) {
                randomQuestions.add(selectedQuestion);
                selectedQuestionIds.add(selectedQuestion.getId());
            }
        }
        return randomQuestions;
    }
}
