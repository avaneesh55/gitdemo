import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DoctorServiceService {

  constructor(private http : HttpClient) { }
  getDoctorData(){
    let apiurl="http://localhost:9192/docapi/user/doctors";
    return this.http.get(apiurl);
  }

  getById(id: number) {
    //return this.http.get<Product>(`http://localhost:3000/products/${id}`);
    console.log('');
    return this.http.get(`http://localhost:9192/docapi/user/${id}/patient`);
   }
}
