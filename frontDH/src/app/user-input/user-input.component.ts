import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import { RegUserServiceService } from '../services/reg-user-service.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-user-input',
  templateUrl: './user-input.component.html',
  styleUrls: ['./user-input.component.css']
})
export class UserInputComponent implements OnInit {

  generalForm: FormGroup
  scalpForm: FormGroup
  porosityForm: FormGroup
  externalForm: FormGroup

  preparation:any;
  advices:any;

  constructor(private fb: FormBuilder, private service:RegUserServiceService, private router: Router) {
    this.generalForm = this.fb.group({
      hairShape: ['', Validators.required],
      hairTickness: ['', Validators.required],
      hairElasticity: ['', Validators.required],
      hairDensity: ['', Validators.required]
    });

    this.scalpForm = this.fb.group({
      scalpType: ['', Validators.required],
      scalpSensitivity: ['', Validators.required],
    });

    this.porosityForm = this.fb.group({
      a: ['', Validators.required],
      b: ['', Validators.required],
      c: ['', Validators.required],
      d: ['', Validators.required],
      e: ['', Validators.required],
      f: ['', Validators.required],
      g: ['', Validators.required],
      h: ['', Validators.required],
      i: ['', Validators.required],
      j: ['', Validators.required],
      k: ['', Validators.required],
    });

    this.externalForm = this.fb.group({
      dyedHair: ['', Validators.required],
      bleachedHair: ['', Validators.required],
      dandruff: ['', Validators.required],
      fungal: ['', Validators.required],
      pregnacy: ['', Validators.required],
      sickness: ['', Validators.required],
      operation: ['', Validators.required],
      itching: ['', Validators.required],
    })
  }
  

  ngOnInit(): void {
  }

  profile(){
    this.router.navigate(['/UserProfileComponent']);
  }

  pokupi(){
    //console.log(this.generalForm.value)
    //console.log(this.scalpForm.value)
    //console.log(this.porosityForm.value)
    //console.log(this.externalForm.value)

    const niz = [Number(this.porosityForm.value.a), Number(this.porosityForm.value.b), Number(this.porosityForm.value.c), 
      Number(this.porosityForm.value.d), Number(this.porosityForm.value.e), Number(this.porosityForm.value.f), 
      Number(this.porosityForm.value.g), Number(this.porosityForm.value.h), Number(this.porosityForm.value.i),
      Number(this.porosityForm.value.j), Number(this.porosityForm.value.k)];

    const send = {
      'hairShape': this.generalForm.value.hairShape,
      'hairTickness': this.generalForm.value.hairTickness,
      'hairElasticity': this.generalForm.value.hairElasticity,
      'hairDensity': this.generalForm.value.hairDensity,
      'scalpSensitivity': this.scalpForm.value.scalpSensitivity,
      'scalpType': this.scalpForm.value.scalpType,
      'dyedHair': this.externalForm.value.dyedHair,
      'bleachedHair': this.externalForm.value.bleachedHair,
      'dandruff': this.externalForm.value.dandruff,
      'fungal': this.externalForm.value.fungal,
      'pregnacy': this.externalForm.value.pregnacy,
      'sickness': this.externalForm.value.sickness,
      'operation': this.externalForm.value.operation,
      'itching': this.externalForm.value.itching,
      'porosityInput': niz
    };
    
    
    this.service.calculate(send)
    .subscribe(
      data => {
        console.log("Uspjeh!");
        this.preparation = data
        this.service.advices().subscribe((data:any) => {
          this.advices = data
          this.router.navigate(['/ResultPreparationComponent'], {state:{data:{"preparation": this.preparation, "advices":this.advices}}})
        });
        
      },
      error => {
        console.log("Neki error se desio");
        console.log(error)
      });
  }

  

}
