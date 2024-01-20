import {Component, OnInit} from '@angular/core';
import {AxiosService} from "../services/axios.service";

@Component({
  selector: 'app-auth-content',
  templateUrl: './auth-content.component.html',
  styleUrls: ['./auth-content.component.css']
})

export class AuthContentComponent {
  data: string[] = [];

  constructor(private axiosService: AxiosService) {

  }

  onLogin(input: any): void {

  }
}
