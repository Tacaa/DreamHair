import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AdminTasksServiceService } from '../services/admin-tasks-service.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  dsForm:FormGroup;
  dwsForm:FormGroup;
  maskForm:FormGroup;
  regForm:FormGroup;
  oilForm:FormGroup;
  

  constructor(private fb:FormBuilder, private service:AdminTasksServiceService, private router:Router) { 
    this.dsForm = this.fb.group({
      name: ['', Validators.required],
      scalpType: ['', Validators.required],
      proteini: ['', Validators.required],
      emo: ['', Validators.required],
      hum: ['', Validators.required]
    });

    this.dwsForm = this.fb.group({
      name: ['', Validators.required],
      senstitivity: ['', Validators.required],
      strong: ['', Validators.required],
      proteini: ['', Validators.required],
      emo: ['', Validators.required],
      hum: ['', Validators.required]
    });

    this.maskForm = this.fb.group({
      name: ['', Validators.required],
      proteini: ['', Validators.required],
      emo: ['', Validators.required],
      hum: ['', Validators.required]
    });

    this.regForm = this.fb.group({
      name: ['', Validators.required],
      proteini: ['', Validators.required],
      emo: ['', Validators.required],
      hum: ['', Validators.required]
    });

    this.oilForm = this.fb.group({
      name: ['', Validators.required],
      porosity: ['', Validators.required]
    });
  }

  ngOnInit(): void {
  }


  profile(){
    this.router.navigate(['/AdminProfile']);
  }


  dodajds(){
    const send = {
      'name': this.dsForm.value.name,
      'scalpType': this.dsForm.value.scalpType,
      'proteinsPercentage': this.dsForm.value.proteini,
      'emollientsPercentage': this.dsForm.value.emo,
      'humectansPercentage': this.dsForm.value.hum,
    }

    this.service.postds(send)
        .subscribe(
          data => {
            console.log(data);
            
          },
          error => {
            console.log("Neki error se desio");
            console.log(error)
          });

          this.dsForm.reset()

  }

  dodajdws(){
    const send = {
      'name': this.dwsForm.value.name,
      'scalpSensitivity': this.dwsForm.value.senstitivity,
      'shampooIntensity': this.dwsForm.value.strong,
      'proteinsPercentage': this.dwsForm.value.proteini,
      'emollientsPercentage': this.dwsForm.value.emo,
      'humectansPercentage': this.dwsForm.value.hum,
    }

    this.service.postdsw(send)
        .subscribe(
          data => {
            console.log(data);
            
          },
          error => {
            console.log("Neki error se desio");
            console.log(error)
          });

          this.dwsForm.reset()

  }


  dodajmask(){
    const send = {
      'name': this.maskForm.value.name,
      'proteinsPercentage': this.maskForm.value.proteini,
      'emollientsPercentage': this.maskForm.value.emo,
      'humectansPercentage': this.maskForm.value.hum,
    }

    this.service.postm(send)
        .subscribe(
          data => {
            console.log(data);
            
          },
          error => {
            console.log("Neki error se desio");
            console.log(error)
          });

          this.maskForm.reset()
  }

  dodajreg(){
    const send = {
      'name': this.regForm.value.name,
      'proteinsPercentage': this.regForm.value.proteini,
      'emollientsPercentage': this.regForm.value.emo,
      'humectansPercentage': this.regForm.value.hum,
    }

    this.service.postr(send)
        .subscribe(
          data => {
            console.log(data);
            
          },
          error => {
            console.log("Neki error se desio");
            console.log(error)
          });

          this.regForm.reset()
  }

  dodajoil(){
    const send = {
      'name': this.oilForm.value.name,
      'type': this.oilForm.value.porosity,
    }

    this.service.posto(send)
        .subscribe(
          data => {
            console.log(data);
            
          },
          error => {
            console.log("Neki error se desio");
            console.log(error)
          });

          this.oilForm.reset()
  }

  


}
