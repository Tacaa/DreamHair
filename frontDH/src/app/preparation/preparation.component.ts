import { Component, Inject, OnInit } from '@angular/core';
import { RegUserServiceService } from '../services/reg-user-service.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-preparation',
  templateUrl: './preparation.component.html',
  styleUrls: ['./preparation.component.css']
})
export class PreparationComponent implements OnInit {

  displayedColumns = ['position', 'name', 'rating', 'comments', 'button'];
  form: FormGroup;

  showForm:boolean = false;
  chosenOne:any;
  rating:number = -1;

  oil_dataSource: any;
  mask_dataSource: any;
  reg_dataSource: any;
  ds_dataSource: any;
  dws_dataSource: any;
  

  constructor(private service:RegUserServiceService, private fb: FormBuilder, private router:Router) { 
    this.form = this.fb.group({
      rating: ['', [Validators.min(0), Validators.max(5)]],
      comment: ['']
    });
    this.service.getReviews().subscribe((data:any) => {
      console.log(data)
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
    this.router.navigate(['/UserProfileComponent']);
  }

  ocjeni(element:any){
    console.log(element);
    this.chosenOne = element;
    this.showForm = true;

    /*
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
      */
  }

  salji(){
    console.log(this.chosenOne);
    console.log(this.form.value);

    if(this.form.value.rating != "" || this.form.value.comment != ""){

      if(this.form.value.rating == ""){
        const send = {
          id : this.chosenOne.review.id,
          rate: -1,
          comment: this.form.value.comment,
          prepId: this.chosenOne.id
        }
  
        console.log(send);
    
        this.service.giveReview(send)
        .subscribe(
          data => {
            console.log(data);
            this.oil_dataSource = data.oils
            this.mask_dataSource =data.masks
            this.reg_dataSource =data.regenerators
            this.ds_dataSource =data.dailyShampoos
            this.dws_dataSource =data.deepWashShampoos
          },
          error => {
            console.log("Neki error se desio");
            console.log(error)
          });
      }else{
        this.rating = this.form.value.rating
        const send = {
          id : this.chosenOne.review.id,
          rate: this.form.value.rating,
          comment: this.form.value.comment,
          prepId: this.chosenOne.id
        }
  
        console.log(send);
    
        this.service.giveReview(send)
        .subscribe(
          data => {
            console.log(data);
            this.oil_dataSource = data.oils
            this.mask_dataSource =data.masks
            this.reg_dataSource =data.regenerators
            this.ds_dataSource =data.dailyShampoos
            this.dws_dataSource =data.deepWashShampoos
          },
          error => {
            console.log("Neki error se desio");
            console.log(error)
          });
      }
      
      
    }

    this.form.reset();
    this.showForm = false;

  }
}

