import { Injectable } from "@angular/core";
import { CanActivate } from "@angular/router";
import { HomeServiceService } from '../home/home-service.service';

@Injectable({
    providedIn: 'root'
  })
  export class AdminRoutes implements CanActivate {
  
    constructor(private authService: HomeServiceService) { }
  
    canActivate() {
      if (this.authService.getTokenData()?.role === 'ROLE_ADMIN') {
        return true;
      }
      return false;
    }
}