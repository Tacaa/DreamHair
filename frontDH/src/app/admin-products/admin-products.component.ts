import { Component, OnInit } from '@angular/core';
import { AdminTasksServiceService } from '../services/admin-tasks-service.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-admin-products',
  templateUrl: './admin-products.component.html',
  styleUrls: ['./admin-products.component.css']
})
export class AdminProductsComponent implements OnInit {
  displayedColumns = ['position', 'name', 'rating', 'comments'];

  oil_dataSource: any;
  mask_dataSource: any;
  reg_dataSource: any;
  ds_dataSource: any;
  dws_dataSource: any;



  constructor(private service:AdminTasksServiceService, private router: Router) { 
    this.service.products().subscribe((data:any) => {
      console.log(data);
      this.oil_dataSource = data.oils
      this.mask_dataSource =data.masks
      this.reg_dataSource =data.regenerators
      this.ds_dataSource =data.dailyShampoos
      this.dws_dataSource =data.deepWashShampoos
    });
  }

  ngOnInit(): void {
  }

  profile(){
    this.router.navigate(['/AdminProfile']);
  }

}

/*
this.service.littleGrades().subscribe((data:any) => {
      console.log(data);
    });
*/ 