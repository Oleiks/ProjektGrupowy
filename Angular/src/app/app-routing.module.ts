import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GrzybListComponent } from './grzyb-list/grzyb-list.component';
import { GrzybDetailsComponent } from './grzyb-details/grzyb-details.component';
import {QuizComponent} from "./quiz/quiz/quiz.component";
import { GrzybRecognitionComponent } from './grzyb-recognition/grzyb-recognition.component';

const routes: Routes = [
  { path: '', redirectTo: '/Grzyby', pathMatch: 'full'},
  { path: 'Grzyby', component: GrzybListComponent },
  { path: 'Detail/:name', component: GrzybDetailsComponent },
  { path: 'Quiz', component: QuizComponent },
  { path: 'Recognition', component: GrzybRecognitionComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
