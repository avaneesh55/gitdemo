import { Component } from '@angular/core';

interface Doctor {
  name: string;
  specialization: string;
  experience: number;
}

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.css']
})
export class DoctorListComponent {
  searchText: string = '';
  doctors: Doctor[] = [
    { name: 'Dr. Harsh', specialization: 'Surgery', experience: 10 },
    { name: 'Dr. Sam', specialization: 'Dermatology', experience: 20 },
    { name: 'Dr. Malik', specialization: 'Pathology', experience: 25 },
    { name: 'Dr. Hejal', specialization: 'Surgery', experience: 15 }
  ];
}