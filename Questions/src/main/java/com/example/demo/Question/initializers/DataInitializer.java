//package com.example.demo.Question.initializers;
//
//import com.example.demo.Question.entities.Answer;
//import com.example.demo.Question.entities.Question;
//import com.example.demo.Question.services.AnswerService;
//import com.example.demo.Question.services.QuestionService;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.UUID;
//
//@Component
//public class DataInitializer implements InitializingBean {
//    private QuestionService questionService;
//    private AnswerService answerService;
//    @Autowired
//    public DataInitializer( QuestionService questionService, AnswerService answerService) {
//        this.questionService = questionService;
//        this.answerService = answerService;
//    }
//    @Override
//    public void afterPropertiesSet()
//    {
//        Question question1 = Question.builder()
//                .id(1L)
//                .content("Jaki jest największy grzyb na świecie?")
//                .build();
//        Answer answer11 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Borowik szlachetny")
//                .isCorrect(false)
//                .question(question1)
//                .build();
//        Answer answer12 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Muchomor czerwony")
//                .isCorrect(false)
//                .question(question1)
//                .build();
//        Answer answer13 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Matowiec leśny")
//                .isCorrect(false)
//                .question(question1)
//                .build();
//        Answer answer14 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Tropikalny grzyb pazurkowaty")
//                .isCorrect(true)
//                .question(question1)
//                .build();
//        questionService.saveQuestion(question1);
//        answerService.saveAnswer(answer11);
//        answerService.saveAnswer(answer12);
//        answerService.saveAnswer(answer13);
//        answerService.saveAnswer(answer14);
//        Question question2 = Question.builder()
//                .id(2L)
//                .content("Jakie jest najpopularniejsze miejsce zbierania grzybów w Europie?")
//                .build();
//        Answer answer21 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Puszcza Białowieska")
//                .isCorrect(false)
//                .question(question2)
//                .build();
//        Answer answer22 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Dolina Baryczy")
//                .isCorrect(false)
//                .question(question2)
//                .build();
//        Answer answer23 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Lasy Północnej Szwecji")
//                .isCorrect(false)
//                .question(question2)
//                .build();
//        Answer answer24 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Lasy Skandynawii")
//                .isCorrect(true)
//                .question(question2)
//                .build();
//        questionService.saveQuestion(question2);
//        answerService.saveAnswer(answer21);
//        answerService.saveAnswer(answer22);
//        answerService.saveAnswer(answer23);
//        answerService.saveAnswer(answer24);
//        Question question3 = Question.builder()
//                .id(3L)
//                .content("Który grzyb jest używany do produkcji penicyliny?")
//                .build();
//        Answer answer31 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Muchomor czerwony")
//                .isCorrect(false)
//                .question(question3)
//                .build();
//        Answer answer32 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Grzyb kurkowy")
//                .isCorrect(false)
//                .question(question3)
//                .build();
//        Answer answer33 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Penicillium chrysogenum")
//                .isCorrect(true)
//                .question(question3)
//                .build();
//        Answer answer34 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kania białoporażka")
//                .isCorrect(false)
//                .question(question3)
//                .build();
//        questionService.saveQuestion(question3);
//        answerService.saveAnswer(answer31);
//        answerService.saveAnswer(answer32);
//        answerService.saveAnswer(answer33);
//        answerService.saveAnswer(answer34);
//        Question question4 = Question.builder()
//                .id(4L)
//                .content("Który grzyb jest symbolem szczęścia w japońskiej kulturze?")
//                .build();
//        Answer answer41 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Shiitake")
//                .isCorrect(false)
//                .question(question4)
//                .build();
//        Answer answer42 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Reishi ")
//                .isCorrect(true)
//                .question(question4)
//                .build();
//        Answer answer43 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Maitake")
//                .isCorrect(false)
//                .question(question4)
//                .build();
//        Answer answer44 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Portobello")
//                .isCorrect(false)
//                .question(question4)
//                .build();
//        questionService.saveQuestion(question4);
//        answerService.saveAnswer(answer41);
//        answerService.saveAnswer(answer42);
//        answerService.saveAnswer(answer43);
//        answerService.saveAnswer(answer44);
//        Question question5 = Question.builder()
//                .id(5L)
//                .content("Który grzyb jest popularnym składnikiem w kuchni włoskiej?")
//                .build();
//        Answer answer51 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kanterel")
//                .isCorrect(false)
//                .question(question5)
//                .build();
//        Answer answer52 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Trufla ")
//                .isCorrect(true)
//                .question(question5)
//                .build();
//        Answer answer53 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Porcini ")
//                .isCorrect(false)
//                .question(question5)
//                .build();
//        Answer answer54 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Morchella")
//                .isCorrect(false)
//                .question(question5)
//                .build();
//        questionService.saveQuestion(question5);
//        answerService.saveAnswer(answer51);
//        answerService.saveAnswer(answer52);
//        answerService.saveAnswer(answer53);
//        answerService.saveAnswer(answer54);
//    }
//}
