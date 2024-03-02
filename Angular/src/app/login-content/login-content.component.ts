import {Component} from '@angular/core';
import {AxiosService} from "../services/axios.service";

@Component({
  selector: 'app-content',
  templateUrl: './login-content.component.html',
  styleUrls: ['./login-content.component.css']
})
export class LoginContentComponent {

  componentToShow: string = "welcome";
  isLoggedIn!: boolean;

  constructor(private axiosService: AxiosService) {
    this.checkLogin();
  }

  showComponent(componentToShow: string): void {
    this.componentToShow = componentToShow;
  }

  checkLogin(): void {
    this.isLoggedIn = this.axiosService.getAuthToken() !== null;
  }

  onLogin(input: any): void {
    this.axiosService.request(
      "POST",
      "/login",
      {
        login: input.login,
        password: input.password
      }
    ).then(response => {
      this.axiosService.setAuthToken(response.data.token);
      this.componentToShow = "messages";
      this.checkLogin();
    });
  }

  onLogout(): void {
    this.axiosService.setAuthToken(null) // remove auth_token from local storage
  }

  onRegister(input: any): void {
    this.axiosService.request(
      "POST",
      "/register",
      {
        firstName: input.firstName,
        lastName: input.lastName,
        login: input.login,
        password: input.password
      }
    ).then(response => {
      this.axiosService.setAuthToken(response.data.token);
      this.componentToShow = "messages";
    });
  }
}
