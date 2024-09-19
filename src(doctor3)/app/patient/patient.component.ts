import { Component } from '@angular/core';
import { DoctorServiceService } from '../doctor-service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrl: './patient.component.css'
})
export class PatientComponent {

  patientFrom: any;
  constructor(private doctorService: DoctorServiceService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((param) => {
      //editt:101 = @Path Varaible
      var id = Number(param.get('docId')); // Read the product id from route
      this.getByDoctorId(id);

      //this.router.navigate(["/Productssss"]);
    });
  }

  getByDoctorId(id: number) {
    this.doctorService.getById(id).subscribe((data) => {
      console.log(data);
      this.patientFrom = data;
    });
  }

}
