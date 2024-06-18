import {Component, OnInit} from '@angular/core';
import {QuestionService} from "./services/question.service";
import {ActivatedRoute, Router} from "@angular/router";
import {AxiosService} from "./services/axios.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title: string = "Shrooms";
  data: string = ""
  constructor(private axiosService: AxiosService) {
  }
   ngOnInit() {
     this.axiosService.request(
       "GET",
       "/current-user",
       null
     ).then(
       (response) => this.data += response.data
     );
   }
}
