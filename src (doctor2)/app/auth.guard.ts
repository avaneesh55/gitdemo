import { CanActivateFn } from '@angular/router';
import { AuthServiceService } from './auth-service.service';
import { inject } from '@angular/core';

export const authGuard: CanActivateFn = (route, state) => {
  // return true;
  // constructor(private authService: AuthService) { }
 
  // canActivate(next: ActivatedRouteSnapshot, state: RouterStateSnapshot)
  //   : Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
  //   if (this.authService.isAuthenticate) {
  //     return true;
  //   } else {
  //     return false;
    // }

    // return true;
const authService = inject(AuthServiceService);
 
  if (authService.isAuthenticate) {
return true;
  } else {
return false;
  }
};
