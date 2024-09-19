import { Component } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {
  constructor(private authService: AuthServiceService) { };
 
  public isShow: boolean = false;
  ngOnInit() {
    console.log(this.isShow);
  }
  setShow(): boolean {
    this.isShow = this.authService.isAuthenticate;
    return this.isShow;
  }

}
