import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from './admin-service.service';
import { HomeServiceService } from '../home/home-service.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-admin-profile',
  templateUrl: './admin-profile.component.html',
  styleUrls: ['./admin-profile.component.css']
})
export class AdminProfileComponent implements OnInit {
  name: String = "";
  lastName : String = "";
  
  constructor(private service:AdminServiceService, private authService:HomeServiceService, private router: Router) { 
    this.service.getUser().subscribe((data:any) => {
      this.name = data.name; 
      this.lastName = data.lastname; 
    });
  }

  ngOnInit(): void {
  }

  logout(){
    this.authService.logout();
  }

  pregled(){
    console.log("USLA U PREGLED");
    this.router.navigate(["/AdminProductsComponent"]);
  }

  izvjestaji(){
    
    this.router.navigate(["/ReportsComponent"]);
  }
}
