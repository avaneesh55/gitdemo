import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddPatientComponent } from './add-patient/add-patient.component';
import { NewAppointmentComponent } from './new-appointment/new-appointment.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { AppointmentDetailsComponent } from './appointment-details/appointment-details.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AddPatientComponent,
    NewAppointmentComponent,
    PatientListComponent,
    AppointmentDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
