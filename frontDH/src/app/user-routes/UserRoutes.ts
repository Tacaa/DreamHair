import { Injectable } from "@angular/core";
import { CanActivate } from "@angular/router";
import { HomeServiceService } from '../home/home-service.service';

@Injectable({
    providedIn: 'root'
  })
  export class UserRoutes implements CanActivate {
  
    constructor(private authService: HomeServiceService) { }
  
    canActivate() {
      if (this.authService.getTokenData()?.role === 'ROLE_REGISTERED_USER') {
        return true;
      }
      return false;
    }
}