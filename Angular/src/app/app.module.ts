import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GrzybListComponent } from './grzyb-list/grzyb-list.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GrzybDetailsComponent } from './grzyb-details/grzyb-details.component';
import { QuizComponent } from './quiz/quiz/quiz.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { LoginContentComponent } from './login-content/login-content.component';
import { ButtonsComponent } from './buttons/buttons.component';
import { WelcomeContentComponent } from './welcome-content/welcome-content.component';
import { GrzybRankingComponent } from './grzyb-ranking/grzyb-ranking.component';
import { GrzybRecognitionComponent } from './grzyb-recognition/grzyb-recognition.component';
import { NgbModule,NgbCarouselModule} from '@ng-bootstrap/ng-bootstrap'

@NgModule({
  declarations: [
    AppComponent,
    GrzybListComponent,
    GrzybDetailsComponent,
    QuizComponent,
    LoginFormComponent,
    LoginContentComponent,
    ButtonsComponent,
    WelcomeContentComponent,
    GrzybRankingComponent,
    GrzybRecognitionComponent,
  ],
  imports: [
    BrowserModule,
    NgbModule,
    NgbCarouselModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
