import {Component, OnInit} from '@angular/core';
import {QuestionService} from "../../services/question.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Axios} from "axios";
import {AxiosService} from "../../services/axios.service";

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {
  questions: any[] = [];
  isQuizStarted: boolean = false;
  isQuizEnded: boolean = false;
  isLastQuestion: boolean = false;
  currentQuestion: number = 0;
  answer: boolean = false;
  score: number = 0;
  data: string = "";

  constructor(private service: QuestionService,
              private route: ActivatedRoute,
              private router: Router,
              private axiosService: AxiosService) {
  }

  ngOnInit() {

    this.service.getQuiz().subscribe(q => this.questions=q);
    this.axiosService.request(
      "GET",
      "/current-user",
      null
    ).then(
      (response) => this.data += response.data
    );
  }

  startQuiz() {
    this.isQuizStarted = true;
  }

  endQuiz() {
    if (this.answer) {
      this.score += 1;
    }
    this.isQuizEnded = true;
    this.isQuizStarted = false;
    console.log(this.isLastQuestion, this.score)
    let name: string[] = this.data.split(" ");
    if(this.data!="") {
      this.axiosService.request(
        "PUT",
        "/api/ranking/user",
        {
          firstName: name[0],
          lastName: name[1],
          score: this.score
        }
      )
    }
  }

  nextQuestion() {
    this.currentQuestion += 1;
    if (this.currentQuestion < this.questions.length - 1) {
      if (this.answer) {
        this.score += 1;
      }
    } else {
      if (this.answer) {
        this.score += 1;
      }
      this.isLastQuestion = true;
    }
    this.answer=false;
    console.log(this.isLastQuestion, this.score)
  }

  selectAnswer(answer: any) {
    for (let a of this.questions[this.currentQuestion].answers) {
      a.isSelected = undefined;
    }
    answer.isSelected = true;
    this.answer = answer.correct;
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
