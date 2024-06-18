import {Component} from '@angular/core';
import {AxiosService} from "../services/axios.service";
import {AuthService} from "../services/auth.service";

@Component({
  selector: 'app-content',
  templateUrl: './login-content.component.html',
  styleUrls: ['./login-content.component.css']
})
export class LoginContentComponent {

  componentToShow: string = "welcome";
  isLoggedIn!: boolean;

  constructor(private axiosService: AxiosService, private authService: AuthService) {
    this.checkLogin();
  }

  showComponent(componentToShow: string): void {
    this.componentToShow = componentToShow;
  }

  checkLogin(): void {
    this.isLoggedIn = this.axiosService.getAuthToken() !== null;
    this.authService.loggedIn.next(this.authService.isLoggedIn())
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
    this.checkLogin();
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
