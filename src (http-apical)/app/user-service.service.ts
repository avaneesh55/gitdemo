import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http : HttpClient) { } //Dependency INjections
 
  getUserData(){
    let apiurl="https://jsonplaceholder.typicode.com/users";
    return this.http.get(apiurl);
  }
 
}
