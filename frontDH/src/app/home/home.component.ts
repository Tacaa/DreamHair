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
          console.log(this.service.getTokenData())
          //this.router.navigate(['/AdminProfile'], {state:{data:{"id": this.service.getTokenData()?.id}}});
          this.router.navigate(['/AdminProfile']);
        } else if (this.service.getTokenData()?.role === "ROLE_REGISTERED_USER") {
          this.router.navigate(['/UserProfileComponent']);
        }
      },
      error => {
        this.openSnackBar("Uneseno pogrešno korisničko ime ili lozinka! :(", this.RESPONSE_ERROR);
      });
  }

  openSnackBar(msg: string, responseCode: number) {
    this.snackBar.open(msg, "x", {
      duration: 5000,
      verticalPosition: this.verticalPosition,
      panelClass: responseCode === this.RESPONSE_OK ? "back-green" : "back-red"
    });
  }

  
  
}
