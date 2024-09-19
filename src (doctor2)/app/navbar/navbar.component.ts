import { Component } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {
  constructor (private authService:AuthServiceService){};
  public isShow : boolean =false;
    ngOnInit() {
      console.log(this.isShow);
  }
  ngAfterContentChecked(){
    this.setShow();
    console.log("I am called");
  }
  setShow():boolean{
    this.isShow=this.authService.isAuthenticate;
 return this.isShow;
  }

}
