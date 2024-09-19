import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { DocListComponent } from './doc-list/doc-list.component';
import { AddDocComponent } from './add-doc/add-doc.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SearchPipe } from './search.pipe';
import { FormsModule } from '@angular/forms';
import { DoctorServiceService } from './doctor-service.service';
import { HttpClientModule } from '@angular/common/http';
import { PatientComponent } from './patient/patient.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    DocListComponent,
    AddDocComponent,
    NavbarComponent,
    SearchPipe,
    PatientComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [DoctorServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
