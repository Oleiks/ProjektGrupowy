import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GrzybListComponent } from './grzyb-list/grzyb-list.component';
import { GrzybAddComponent } from './grzyb-add/grzyb-add.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GrzybEditComponent } from './grzyb-edit/grzyb-edit.component';
import { GrzybDetailsComponent } from './grzyb-details/grzyb-details.component';
import { QuizComponent } from './quiz/quiz/quiz.component';
import { AuthContentComponent } from './auth-content/auth-content.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { ContentComponent } from './content/content.component';
import { ButtonsComponent } from './buttons/buttons.component';
import { WelcomeContentComponent } from './welcome-content/welcome-content.component';


@NgModule({
  declarations: [
    AppComponent,
    GrzybListComponent,
    GrzybAddComponent,
    GrzybEditComponent,
    GrzybDetailsComponent,
    QuizComponent,
    AuthContentComponent,
    LoginFormComponent,
    ContentComponent,
    ButtonsComponent,
    WelcomeContentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
