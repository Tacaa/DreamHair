import { Component, OnInit } from '@angular/core';
import { RegUserServiceService } from '../services/reg-user-service.service';

@Component({
  selector: 'app-diary',
  templateUrl: './diary.component.html',
  styleUrls: ['./diary.component.css']
})
export class DiaryComponent implements OnInit {

  constructor(private service:RegUserServiceService) {
    this.service.getDiary().subscribe((data:any) => {
      console.log(data);
    });
   }

  ngOnInit(): void {
  }

  klik(){
    const send = {
      hairWash : "2021.07.01 10:00",
	    hairGrowth : "1.4",
	    hairState : "4",
	    comment: "Neki kom"
    }

    this.service.postDiary(send)
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
