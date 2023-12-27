import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GrzybListComponent } from './grzyb-list/grzyb-list.component';
import { GrzybAddComponent } from './grzyb-add/grzyb-add.component'; // Import the new component
import { GrzybEditComponent } from './grzyb-edit/grzyb-edit.component';
import { GrzybDetailsComponent } from './grzyb-details/grzyb-details.component';


const routes: Routes = [
  { path: 'Grzyby', component: GrzybListComponent },
  { path: 'Dodaj', component: GrzybAddComponent },
  { path: 'Edit/:name', component: GrzybEditComponent },
  { path: 'Detail/:name', component: GrzybDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }