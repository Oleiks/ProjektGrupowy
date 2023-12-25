import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GrzybListComponent } from './grzyb-list/grzyb-list.component';
import { GrzybAddComponent } from './grzyb-add/grzyb-add.component';
import { ReactiveFormsModule } from '@angular/forms';
import { GrzybEditComponent } from './grzyb-edit/grzyb-edit.component';
import { GrzybDetailsComponent } from './grzyb-details/grzyb-details.component';


@NgModule({
  declarations: [
    AppComponent,
    GrzybListComponent,
    GrzybAddComponent,
    GrzybEditComponent,
    GrzybDetailsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
