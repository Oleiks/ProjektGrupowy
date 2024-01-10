package com.example.demo.Question.controllers;

import com.example.demo.Question.dto.QuestionDTO;
import com.example.demo.Question.entities.Question;
import com.example.demo.Question.services.AnswerService;
import com.example.demo.Question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class QuestionController {
    private final QuestionService questionService;
    @Autowired
    public QuestionController(QuestionService questionService){
        this.questionService=questionService;
    }
    @GetMapping("/questions/{id}")
    public ResponseEntity<QuestionDTO> GetQuestion(@PathVariable ("id") Long id){
        Optional<Question> question = questionService.find(id);
        if (question.isPresent()){
            QuestionDTO questionDTO = QuestionDTO.builder()
                    .id(question.get().getId())
                    .content(question.get().getContent())
                    .answers(question.get().getAnswers().stream().map(a -> QuestionDTO.Answer.builder()
                            .answer(a.getContent())
                            .isCorrect(a.isCorrect())
                            .build()).toList())
                    .build();
            return ResponseEntity.ok(questionDTO);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/questions")
    public ResponseEntity<List<QuestionDTO>> GetQuestions(){
        List<Question> questions = questionService.findAll();
        List<QuestionDTO> questionDTOList = questions.stream().map(q -> QuestionDTO.builder()
                .id(q.getId())
                .content(q.getContent())
                .answers(q.getAnswers().stream().map(a -> QuestionDTO.Answer.builder()
                        .answer(a.getContent())
                        .isCorrect(a.isCorrect())
                        .build()).toList())
                .build()).toList();
        return ResponseEntity.ok(questionDTOList);
    }
    @DeleteMapping("/questions/{id}")
    public ResponseEntity<String> DeleteQuestion(@PathVariable ("id") Long id){
        Optional<Question> question = questionService.find(id);
        if(question.isPresent()){
            questionService.deleteQuestion(question.get());
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/question")
    public ResponseEntity<String> CreateQuestion(@RequestBody QuestionDTO request){
        Question question = Question.builder()
                .id(request.getId())
                .content(request.getContent())
                .build();
        questionService.saveQuestion(question);
        return ResponseEntity.ok().build();
    }
    @PatchMapping("/questions/{id}")
    public ResponseEntity<String> UpdateQuestion(@PathVariable ("id") Long id, @RequestBody QuestionDTO request){
        Optional<Question> question = questionService.find(id);
        if(question.isPresent()){
            question.get().setId(request.getId());
            question.get().setContent(request.getContent());
            questionService.saveQuestion(question.get());
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
