import { Component } from '@angular/core';

@Component({
  selector: 'app-doctor-add',
  templateUrl: './doctor-add.component.html',
  styleUrls: ['./doctor-add.component.css']
})
export class DoctorAddComponent {
  doctor = { name: '', specialization: '', experience: 0 };

  addDoctor() {
    console.log('Doctor added:', this.doctor);
  }
}
