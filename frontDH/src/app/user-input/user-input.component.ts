import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
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

  constructor(private fb: FormBuilder) {
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

  }

  pokupi(){
    console.log(this.generalForm.value)
    console.log(this.scalpForm.value)
    console.log(this.porosityForm.value)
    console.log(this.externalForm.value)
  }

}
