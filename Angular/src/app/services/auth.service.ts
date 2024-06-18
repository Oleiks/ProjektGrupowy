import {Injectable} from "@angular/core";
import { jwtDecode } from "jwt-decode";
import {BehaviorSubject, Observable} from "rxjs";
import {AxiosService} from "./axios.service";


@Injectable({
  providedIn: 'root'
})

@Injectable()
export class AuthService {

  public loggedIn = new BehaviorSubject<boolean>(this.isLoggedIn());

  constructor() {}

  isLoggedIn(): boolean {
    const token = localStorage.getItem('auth_token');
    return !!token;
  }
}
