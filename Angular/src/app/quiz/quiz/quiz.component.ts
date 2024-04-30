import {Component, OnInit} from '@angular/core';
import {QuestionService} from "../../services/question.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit{
  questions: any[]=[];
  isQuizStarted: boolean=false;
  isQuizEnded: boolean=false;
  isLastQuestion:boolean=false;
  currentQuestion: number=0;
  answer: boolean=false;
  score: number=0;
  constructor(private service: QuestionService, private route: ActivatedRoute, private router: Router) {
  }
  ngOnInit() {
    this.service.getQuiz().subscribe(q => this.questions=q);
  }
  startQuiz(){
    this.isQuizStarted = true;
  }
  endQuiz(){
    if(this.answer){
      this.score+=1;
    }
    this.isQuizEnded=true;
    this.isQuizStarted=false;
    console.log(this.isLastQuestion,this.score)
  }
  nextQuestion(){
    this.currentQuestion+=1;
    if(this.currentQuestion<this.questions.length-1){
      if(this.answer){
        this.score+=1;
      }
    }
    else{
      if(this.answer){
        this.score+=1;
      }
      this.isLastQuestion=true;
    }
    console.log(this.isLastQuestion,this.score)
  }
  selectAnswer(answer: any){
    for(let a of this.questions[this.currentQuestion].answers){
      a.isSelected=undefined;
    }
    answer.isSelected=true;
    this.answer=answer.correct;
  }
  restartQuiz(){
    this.ngOnInit();
    this.isLastQuestion=false;
    this.isQuizEnded=false;
    this.isQuizStarted=true;
    this.currentQuestion=0;
    this.answer=false;
    this.score=0;
    for(let q of this.questions){
      for(let a of q.answers){
        a.isSelected = undefined;
      }
    }
  }
}
