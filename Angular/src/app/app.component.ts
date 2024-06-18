import { Component } from '@angular/core';
import {AuthService} from "./services/auth.service";
import {AxiosService} from "./services/axios.service";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    title: string = "Shrooms";
    isLoggedIn: boolean = false;
    currentUsername : string = "";

    constructor(private authService: AuthService, private axiosService: AxiosService) {

        this.authService.loggedIn.subscribe(value => {
            this.isLoggedIn = value;
            if (this.isLoggedIn) {
                this.axiosService.request(
                    "GET",
                    "/current-user",
                    null
                ).then(
                    (response) => this.currentUsername = response.data
                );
            }
        })
    }

}
