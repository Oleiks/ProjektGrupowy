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
  answers: number[]=[];
  result: number=0;
  end: boolean=false;
  constructor(private service: QuestionService, private route: ActivatedRoute, private router: Router) {
  }
  ngOnInit() {
    this.service.getAllQuestions().subscribe(q => this.questions=q);
  }
  onSubmit(){
    let q = 0;
    this.result=0;
    for(let i of this.answers){
      if(this.questions[q].answers[i].correct==true){
        this.result+=1;
        q+=1;
      }
    }
    this.answers=[];
    this.end=true;
  }
}
