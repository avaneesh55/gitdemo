import { Component } from '@angular/core';
import { Patient } from '../model/patient';
import { Appointment } from '../model/appointments';
import { Comment } from '../model/comment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Appointment-manag';
  newPatient: Patient = { name: '', phone: '', email: '' };
  patients: Patient[] = [];

  newComment: Comment = { commenterName: '', comment: '' };
  comments: Comment[] = [];

  newAppointment: Appointment = {
    id: '',
    date: '',
    time: '',
    patients: [],
  };
  appointments: Appointment[] = [];

  addPatient() {
    this.patients.push({ ...this.newPatient });
    this.newPatient = { name: '', phone: '', email: '' };
  }

  sendComments() {
    this.comments.push({ ...this.newComment });
    this.newComment = { commenterName: '', comment: '' };
  }

  addAppointment() {
    this.appointments.push({ ...this.newAppointment });
    this.newAppointment = { id: '', date: '', time: '',patients:[] };
  }

}
