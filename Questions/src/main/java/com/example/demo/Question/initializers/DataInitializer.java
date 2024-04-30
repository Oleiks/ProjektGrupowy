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
//                .id(6L)
//                .content("Jak nazywa się grzyb, który jest szeroko stosowany w tradycyjnej chińskiej medycynie?")
//                .build();
//        Answer answer11 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Chanterelle")
//                .isCorrect(false)
//                .question(question1)
//                .build();
//        Answer answer12 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Shiitake")
//                .isCorrect(true)
//                .question(question1)
//                .build();
//        Answer answer13 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Ostryż")
//                .isCorrect(false)
//                .question(question1)
//                .build();
//        Answer answer14 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Podgrzybek brunatny")
//                .isCorrect(false)
//                .question(question1)
//                .build();
//        questionService.saveQuestion(question1);
//        answerService.saveAnswer(answer11);
//        answerService.saveAnswer(answer12);
//        answerService.saveAnswer(answer13);
//        answerService.saveAnswer(answer14);
//        Question question2 = Question.builder()
//                .id(7L)
//                .content("Który grzyb jest znany z tego, że może świecić w ciemnościach?")
//                .build();
//        Answer answer21 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kania białoporażka")
//                .isCorrect(false)
//                .question(question2)
//                .build();
//        Answer answer22 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Muchomor czerwony")
//                .isCorrect(false)
//                .question(question2)
//                .build();
//        Answer answer23 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Grzyb świecący")
//                .isCorrect(true)
//                .question(question2)
//                .build();
//        Answer answer24 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Matowiec leśny")
//                .isCorrect(false)
//                .question(question2)
//                .build();
//        questionService.saveQuestion(question2);
//        answerService.saveAnswer(answer21);
//        answerService.saveAnswer(answer22);
//        answerService.saveAnswer(answer23);
//        answerService.saveAnswer(answer24);
//        Question question3 = Question.builder()
//                .id(8L)
//                .content("Jaki grzyb jest używany do produkcji popularnego napoju alkoholowego w Japonii?")
//                .build();
//        Answer answer31 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Shimeji")
//                .isCorrect(false)
//                .question(question3)
//                .build();
//        Answer answer32 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Enokitake")
//                .isCorrect(false)
//                .question(question3)
//                .build();
//        Answer answer33 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Agaricus bisporus")
//                .isCorrect(false)
//                .question(question3)
//                .build();
//        Answer answer34 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kōji ")
//                .isCorrect(true)
//                .question(question3)
//                .build();
//        questionService.saveQuestion(question3);
//        answerService.saveAnswer(answer31);
//        answerService.saveAnswer(answer32);
//        answerService.saveAnswer(answer33);
//        answerService.saveAnswer(answer34);
//        Question question4 = Question.builder()
//                .id(9L)
//                .content("Który grzyb jest powszechnie stosowany jako substytut mięsa w wegetariańskich potrawach?")
//                .build();
//        Answer answer41 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kapelusz ostryżu")
//                .isCorrect(false)
//                .question(question4)
//                .build();
//        Answer answer42 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Reishi ")
//                .isCorrect(false)
//                .question(question4)
//                .build();
//        Answer answer43 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Grzyb ostrygowy")
//                .isCorrect(false)
//                .question(question4)
//                .build();
//        Answer answer44 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Grzyb mun")
//                .isCorrect(true)
//                .question(question4)
//                .build();
//        questionService.saveQuestion(question4);
//        answerService.saveAnswer(answer41);
//        answerService.saveAnswer(answer42);
//        answerService.saveAnswer(answer43);
//        answerService.saveAnswer(answer44);
//        Question question5 = Question.builder()
//                .id(10L)
//                .content("Który grzyb jest często używany w kuchni wschodnioeuropejskiej do przygotowywania różnych potraw, takich jak barszcz?")
//                .build();
//        Answer answer51 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Maslak")
//                .isCorrect(false)
//                .question(question5)
//                .build();
//        Answer answer52 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kania białoporażka")
//                .isCorrect(false)
//                .question(question5)
//                .build();
//        Answer answer53 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Borowik szlachetny")
//                .isCorrect(false)
//                .question(question5)
//                .build();
//        Answer answer54 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Borowik dęty")
//                .isCorrect(true)
//                .question(question5)
//                .build();
//        questionService.saveQuestion(question5);
//        answerService.saveAnswer(answer51);
//        answerService.saveAnswer(answer52);
//        answerService.saveAnswer(answer53);
//        answerService.saveAnswer(answer54);
//        Question question6 = Question.builder()
//                .id(11L)
//                .content("Który grzyb jest uważany za \"diament lasu\" ze względu na swoją cenę i smak?")
//                .build();
//        Answer answer61 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kania białoporażka")
//                .isCorrect(false)
//                .question(question6)
//                .build();
//        Answer answer62 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Borowik szlachetny")
//                .isCorrect(true)
//                .question(question6)
//                .build();
//        Answer answer63 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Muchomor czerwony")
//                .isCorrect(false)
//                .question(question6)
//                .build();
//        Answer answer64 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Trufla")
//                .isCorrect(false)
//                .question(question6)
//                .build();
//        questionService.saveQuestion(question6);
//        answerService.saveAnswer(answer61);
//        answerService.saveAnswer(answer62);
//        answerService.saveAnswer(answer63);
//        answerService.saveAnswer(answer64);
//        Question question7 = Question.builder()
//                .id(12L)
//                .content("Który grzyb jest popularny w kuchni francuskiej i jest często używany w zupach i sosach?")
//                .build();
//        Answer answer71 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Reishi")
//                .isCorrect(false)
//                .question(question7)
//                .build();
//        Answer answer72 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Morchella")
//                .isCorrect(false)
//                .question(question7)
//                .build();
//        Answer answer73 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Kapelusz ostryżu")
//                .isCorrect(false)
//                .question(question7)
//                .build();
//        Answer answer74 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Chanterelle")
//                .isCorrect(true)
//                .question(question7)
//                .build();
//        questionService.saveQuestion(question7);
//        answerService.saveAnswer(answer71);
//        answerService.saveAnswer(answer72);
//        answerService.saveAnswer(answer73);
//        answerService.saveAnswer(answer74);
//        Question question8 = Question.builder()
//                .id(13L)
//                .content("Który grzyb jest nazywany \"grzybem króla\" ze względu na swój imponujący rozmiar?")
//                .build();
//        Answer answer81 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Boczniak")
//                .isCorrect(false)
//                .question(question8)
//                .build();
//        Answer answer82 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Grzyb kurkowy")
//                .isCorrect(false)
//                .question(question8)
//                .build();
//        Answer answer83 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Agaricus augustus")
//                .isCorrect(true)
//                .question(question8)
//                .build();
//        Answer answer84 = Answer.builder()
//                .id(UUID.randomUUID())
//                .content("Muchomor czerwony")
//                .isCorrect(false)
//                .question(question8)
//                .build();
//        questionService.saveQuestion(question8);
//        answerService.saveAnswer(answer81);
//        answerService.saveAnswer(answer82);
//        answerService.saveAnswer(answer83);
//        answerService.saveAnswer(answer84);
//    }
//}
