import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GrzybListComponent } from './grzyb-list/grzyb-list.component';
import { GrzybDetailsComponent } from './grzyb-details/grzyb-details.component';
import {QuizComponent} from "./quiz/quiz/quiz.component";
import {LoginContentComponent} from "./login-content/login-content.component";
import {GrzybRankingComponent} from "./grzyb-ranking/grzyb-ranking.component";
import { GrzybRecognitionComponent } from './grzyb-recognition/grzyb-recognition.component';

const routes: Routes = [
  { path: '', redirectTo: '/Grzyby', pathMatch: 'full'},
  { path: 'Grzyby', component: GrzybListComponent },
  { path: 'Detail/:name', component: GrzybDetailsComponent },
  { path: 'Quiz', component: QuizComponent },
  { path: 'Ranking', component: GrzybRankingComponent },
  { path: 'login', component: LoginContentComponent},
  { path: 'Recognition', component: GrzybRecognitionComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
