import { Component } from '@angular/core';
import { UserServiceService } from '../user-service.service';
 
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {

 displayedColumns: string[] = ['id', 'name', 'username', 'email', 'phone', 'website'];
  userData: any;
  constructor(private userService: UserServiceService) {
    this.userService.getUserData().subscribe(data => {console.log(data);
      this.userData = data;
      console.log(data);
    })
  }
}
 
