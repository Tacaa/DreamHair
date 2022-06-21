import { Component, OnInit } from '@angular/core';
import { HomeServiceService } from './home-service.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar, MatSnackBarVerticalPosition } from '@angular/material/snack-bar';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  loginForm: FormGroup;
  RESPONSE_OK: number = 0;
  RESPONSE_ERROR: number = -1;
  verticalPosition: MatSnackBarVerticalPosition = "top";

  constructor(private fb: FormBuilder, private router: Router, private service: HomeServiceService, private snackBar: MatSnackBar) { 
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }
  
  ngOnInit(): void {
    
    
  }


  public hasError = (controlName: string, errorName: string) => {
    return this.loginForm.controls[controlName].hasError(errorName);
  }


  login(){
    console.log("ckick login")
    this.service.login(this.loginForm.value)
    .subscribe(
      data => {
        console.log(this.service.getTokenData()?.role)
        if (this.service.getTokenData()?.role === "ROLE_ADMIN") {
          console.log("admin!!!")
          this.router.navigate(['/AdminProfile']);
        } else if (this.service.getTokenData()?.role === "ROLE_REGISTERED_USER") {
          this.router.navigate(['/UserProfileComponent']);
        }
      },
      error => {
        if (error.status === 404) {
          console.log("Invalid username/password!");
        } else if (error.status === 403) {
          console.log("Email has not been verifed!");
        }
      });
  }

  signupPage(){
    console.log("ckick login")
  }
  
}
