import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from './admin-service.service';
import { HomeServiceService } from '../home/home-service.service';
@Component({
  selector: 'app-admin-profile',
  templateUrl: './admin-profile.component.html',
  styleUrls: ['./admin-profile.component.css']
})
export class AdminProfileComponent implements OnInit {
  name: String = "";
  lastName : String = "";
  
  constructor(private service:AdminServiceService, private authService:HomeServiceService) { 
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
}
