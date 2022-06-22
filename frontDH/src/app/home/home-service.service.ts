import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse} from '@angular/common/http';
import { Main } from '../../main'
import { Router } from '@angular/router';
import { throwError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { UserProfileComponent } from '../user-profile/user-profile.component';

@Injectable({
  providedIn: 'root'
})
export class HomeServiceService {
  readonly REG_URL : string = Main.PATH + "auth/register";

  constructor
    (
      private router: Router,
      private http: HttpClient
    ) { }
  
    private access_token = "";
    private token_data = null;
  
    login(user: any) {
      const body = {
        'username': user.username,
        'password': user.password
      };
      return this.http.post<any>(Main.PATH + "auth/login", body)
        .pipe(map((res) => {
          this.access_token = res.accessToken;
          this.token_data = res;
          window.localStorage.setItem("token", this.access_token);
        }, catchError(this.errorHander)));
    }
  
    logout() {
      this.access_token = "";
      this.token_data = null;
      window.localStorage.setItem('userId', "");
      window.localStorage.setItem('username', "");
      window.localStorage.setItem('role', "");
      this.router.navigate(['']);
    }
  
   
    tokenIsPresent() {
      return this.access_token != null;
    }
  
    getToken() {
      return this.access_token;
    }
  
    getTokenData() {
      if ( this.token_data != null) {
        return this.token_data;
      } else {
        return {
          id: 0,
          username: "",
          role: "",
        };
      }
    }
  
    errorHander(error: HttpErrorResponse) {
      return throwError(error);
    }


    register(data:any){
      const body = {
        'id': -1,
        'username': data.username,
        'password': data.password,
        'name': data.name,
        'lastname': data.lastname,
      };
      return this.http.post<any>(this.REG_URL, body)
               .pipe(catchError(this.errorHander));
  }

  }
