import { Component } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  constructor(private authService: AuthServiceService){}
  loginSubmit(loginForm:any){
    console.log(loginForm);
    this.authService.login(loginForm.username,loginForm.password);
      }
}
