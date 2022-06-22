import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar, MatSnackBarVerticalPosition } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { HomeServiceService } from '../home/home-service.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  loginForm: FormGroup;
  RESPONSE_OK: number = 0;
  RESPONSE_ERROR: number = -1;
  verticalPosition: MatSnackBarVerticalPosition = "top";

  constructor(private fb: FormBuilder, private router: Router, private service: HomeServiceService, private snackBar: MatSnackBar) { 
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
      passwordAgain: ['', Validators.required],
      name: ['', Validators.required],
      lastname: ['', Validators.required]
    });
  }

  public hasError = (controlName: string, errorName: string) => {
    return this.loginForm.controls[controlName].hasError(errorName);
  }

  registration(){
    console.log(this.loginForm.value)

    if(this.loginForm.value.password != this.loginForm.value.passwordAgain){
      this.openSnackBar("Lozinke moraju da se poklapaju! :)", this.RESPONSE_ERROR);
    }else{
      this.service.register(this.loginForm.value).subscribe(
        response => {
          this.service.login(this.loginForm.value)
            .subscribe(
              data => {
                this.router.navigate(['/UserProfileComponent']);
              },
              error => {
                if (error.status === 404) {
                  console.log("Unesen je pogresan username ili lozinka! :(");
                } else if (error.status === 403) {
                  console.log("Email has not been verifed!");
                }
              });
        },
        error => {
          this.openSnackBar("Takav username već postoji, molim Vas unesite neki drugi! :)", this.RESPONSE_ERROR);
        }
      );

    }
    
  }


  home(){
    this.router.navigate(['']);
  }

  ngOnInit(): void {
  }

  openSnackBar(msg: string, responseCode: number) {
    this.snackBar.open(msg, "x", {
      duration: 5000,
      verticalPosition: this.verticalPosition,
      panelClass: responseCode === this.RESPONSE_OK ? "back-green" : "back-red"
    });
  }

}
