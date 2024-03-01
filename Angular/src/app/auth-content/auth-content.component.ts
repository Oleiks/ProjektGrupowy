import {Component, OnInit} from '@angular/core';
import {AxiosService} from "../services/axios.service";

@Component({
  selector: 'app-auth-content',
  templateUrl: './auth-content.component.html',
  styleUrls: ['./auth-content.component.css']
})

export class AuthContentComponent implements OnInit{
  data: string[] = [];


  constructor(private axiosService: AxiosService) {

  }

  ngOnInit(): void {
    this.axiosService.request(
      "GET",
      "/hello-world",
      null
    ).then(
      (response) => this.data = response.data
    );
  }
}
