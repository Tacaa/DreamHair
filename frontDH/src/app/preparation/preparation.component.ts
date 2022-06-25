import { Component, OnInit } from '@angular/core';
import { RegUserServiceService } from '../services/reg-user-service.service';

@Component({
  selector: 'app-preparation',
  templateUrl: './preparation.component.html',
  styleUrls: ['./preparation.component.css']
})
export class PreparationComponent implements OnInit {

  constructor(private service:RegUserServiceService) { 
    this.service.getReviews().subscribe((data:any) => {
      console.log(data);
    });
  }

  ngOnInit(): void {
  }

  ocjeni(){
    const send = {
      id : 3,
      rate: 5,
      comment: "Neki komentar" 
    }

    this.service.giveReview(send)
    .subscribe(
      data => {
        console.log(data);
      },
      error => {
        console.log("Neki error se desio");
        console.log(error)
      });

  }

}
