import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GrzybListComponent } from './grzyb-list/grzyb-list.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { GrzybDetailsComponent } from './grzyb-details/grzyb-details.component';
import { QuizComponent } from './quiz/quiz/quiz.component';
import { GrzybRecognitionComponent } from './grzyb-recognition/grzyb-recognition.component';


@NgModule({
  declarations: [
    AppComponent,
    GrzybListComponent,
    GrzybDetailsComponent,
    QuizComponent,
    GrzybRecognitionComponent,
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
