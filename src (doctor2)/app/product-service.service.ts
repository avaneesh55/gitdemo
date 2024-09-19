import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(private http : HttpClient) { }

  getUserData(){
    let apiurl="http://localhost:3000/products";
    return this.http.get(apiurl);
}
}
