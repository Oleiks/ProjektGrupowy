import {Component, OnInit} from '@angular/core';
import {QuestionService} from "../services/question.service";
import {ActivatedRoute, Router} from "@angular/router";
import {AxiosService} from "../services/axios.service";

@Component({
  selector: 'app-grzyb-ranking',
  templateUrl: './grzyb-ranking.component.html',
  styleUrls: ['./grzyb-ranking.component.css']
})
export class GrzybRankingComponent implements OnInit{
  users: any[] = [];
  constructor(private route: ActivatedRoute,
              private router: Router,
              private axiosService: AxiosService) {
  }

  ngOnInit(){
    this.axiosService.request(
      "GET",
      "/api/ranking/users",
      null
    ).then((response) => this.users = response.data);
    console.log(this.users);
  }
}
