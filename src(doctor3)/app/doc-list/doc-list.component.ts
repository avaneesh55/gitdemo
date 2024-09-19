import { Component } from '@angular/core';
import { DoctorServiceService } from '../doctor-service.service';
import { Router } from '@angular/router';
import { Doctor } from '../../model/Doctor';

@Component({
  selector: 'app-doc-list',
  templateUrl: './doc-list.component.html',
  styleUrl: './doc-list.component.css'
})
export class DocListComponent {
  filter = '';
  // doctors: Doctor[] = [
  //   {
  //     Id: 1, FirstName: 'Alex', LastName: 'Martin',
  //     DOB: '10/08/1999', Gender: 'Male', Degree: 'MBBS', Fees: 500
  //   },
  //   {
  //     Id: 2, FirstName: 'Bob', LastName: 'Mathur',
  //     DOB: '6/2/1986', Gender: 'Male', Degree: 'MBBS', Fees: 700
  //   },
  //   {
  //     Id: 3, FirstName: 'Samiksha', LastName: 'Rakshit',
  //     DOB: '12/14/1981', Gender: 'Female', Degree: 'MBBS', Fees: 900
  //   },
  //   {
  //     Id: 4, FirstName: 'Purab', LastName: 'Bore',
  //     DOB: '9/16/1999', Gender: 'Male', Degree: 'MBBS', Fees: 400
  //   },
  //   {
  //     Id: 5, FirstName: 'Jhon', LastName: 'Joshef',
  //     DOB: '11/7/1991', Gender: 'Male', Degree: 'MBBS', Fees: 1500
  //   },
  //   {
  //     Id: 6, FirstName: 'Jessi', LastName: 'Joshn',
  //     DOB: '2/16/1997', Gender: 'Female', Degree: 'MBBS', Fees: 700
  //   },
  //   {
  //     Id: 7, FirstName: 'Boby', LastName: 'Bindu',
  //     DOB: '5/21/1989', Gender: 'Female', Degree: 'MBBS', Fees: 850
  //   },

  // ]
  doctorList: any = [];

  constructor(private doctor: DoctorServiceService) {
    this.getAllDoctors();
  }
  getAllDoctors() {
    this.doctor.getDoctorData().subscribe(data => {
      this.doctorList = data;
    })
  }
}
