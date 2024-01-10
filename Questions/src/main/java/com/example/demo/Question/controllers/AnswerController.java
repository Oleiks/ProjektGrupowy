package com.example.demo.Question.controllers;

import com.example.demo.Question.dto.AnswerDTO;
import com.example.demo.Question.entities.Answer;
import com.example.demo.Question.entities.Question;
import com.example.demo.Question.services.AnswerService;
import com.example.demo.Question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;
    @Autowired
    public AnswerController(AnswerService answerService, QuestionService questionService){
        this.answerService=answerService;
        this.questionService=questionService;
    }
    @GetMapping("/question/{id}/answers")
    public ResponseEntity<List<AnswerDTO>> GetQuestionAnswers(@PathVariable ("id") Long id){
        Optional<Question> question = questionService.find(id);
        if(question.isPresent()){
            List<AnswerDTO> answerDTOList = question.get().getAnswers().stream().map(a -> AnswerDTO.builder()
                    .id(a.getId())
                    .content(a.getContent())
                    .isCorrect(a.isCorrect())
                    .questionId(a.getQuestion().getId())
                    .build()).toList();
            return ResponseEntity.ok(answerDTOList);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/answers/{id}")
    public ResponseEntity<AnswerDTO> GetAnswer(@PathVariable ("id") UUID id){
        Optional<Answer> answer = answerService.find(id);
        if(answer.isPresent()){
            AnswerDTO answerDTO = AnswerDTO.builder()
                    .content(answer.get().getContent())
                    .isCorrect(answer.get().isCorrect())
                    .questionId(answer.get().getQuestion().getId())
                    .build();
            return ResponseEntity.ok(answerDTO);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/answer")
    public ResponseEntity<String> CreateAnswer(@RequestBody AnswerDTO request){
        Optional<Question> question = questionService.find(request.getQuestionId());
        if(question.isPresent()) {
            Answer answer = Answer.builder()
                    .id(UUID.randomUUID())
                    .content(request.getContent())
                    .isCorrect(request.isCorrect())
                    .question(question.get())
                    .build();
                answerService.saveAnswer(answer);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Pytanie o podanym id nie istnieje");
        }
    }
    @PatchMapping("/answers/{id}")
    public ResponseEntity<String> UpdateAnswer(@PathVariable ("id") UUID id,@RequestBody AnswerDTO request){
        Optional<Answer> answer = answerService.find(id);
        Optional<Question> question =questionService.find(request.getQuestionId());
        if(answer.isPresent()&&question.isPresent()){
            answer.get().setContent(request.getContent());
            answer.get().setCorrect(request.isCorrect());
            answer.get().setQuestion(question.get());
            answerService.saveAnswer(answer.get());
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/answers/{id}")
    public ResponseEntity<String> DeleteAnswer(@PathVariable ("id")UUID id){
        Optional<Answer> answer = answerService.find(id);
        if(answer.isPresent()){
            answerService.deleteAnswer(answer.get());
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
