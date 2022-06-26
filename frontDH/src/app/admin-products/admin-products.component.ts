import { Component, OnInit } from '@angular/core';
import { AdminTasksServiceService } from '../services/admin-tasks-service.service';

@Component({
  selector: 'app-admin-products',
  templateUrl: './admin-products.component.html',
  styleUrls: ['./admin-products.component.css']
})
export class AdminProductsComponent implements OnInit {

  constructor(private service:AdminTasksServiceService) { 
    this.service.littleGrades().subscribe((data:any) => {
      console.log(data);
    });
  }

  ngOnInit(): void {
  }

}
