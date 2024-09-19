import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor() { }
  isAuthenticate: boolean = false;
  login(email: string, password: string): Observable<boolean> {
    if (email === 'abc' && password === 'abc') {
      this.isAuthenticate = true;
      console.log("Allow to display");
      return of(this.isAuthenticate);
    }
    else{
    console.log("NOT Allow to display");
    this.isAuthenticate=false;
    return of(this.isAuthenticate);
    }
  }
}
