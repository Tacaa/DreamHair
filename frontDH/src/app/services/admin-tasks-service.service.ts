import { Injectable } from '@angular/core';
import { throwError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { HttpClient, HttpErrorResponse} from '@angular/common/http';
import { Main } from '../../main';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AdminTasksServiceService {

  readonly GIVE_PRODUCTS : string = Main.PATH + "admin/products";
  readonly LITTLE_GRADES_URL : string = Main.PATH + "admin/littleGrade/";
  readonly BIG_GRADES_URL : string = Main.PATH + "admin/bigGrade/";
  readonly LITTLE_COMMENT_URL : string = Main.PATH + "admin/littleComment/";
  readonly BIG_COMMENT_URL : string = Main.PATH + "admin/bigComment/";
  
  readonly POST_OIL : string = Main.PATH + "admin/postOil";
  readonly POST_MASK : string = Main.PATH + "admin/postMask";
  readonly POST_REG : string = Main.PATH + "admin/postReg";
  readonly POST_DS : string = Main.PATH + "admin/postDS";
  readonly POST_DSW : string = Main.PATH + "admin/postDSW";

  constructor
  (
    private router: Router,
    private http: HttpClient
  ) { }

  products(){
    return this.http.get(this.GIVE_PRODUCTS);
  }

  littleGrades(x:number){
    return this.http.get(this.LITTLE_GRADES_URL + x);
  }

  bigGrades(x:number){
    return this.http.get(this.BIG_GRADES_URL + x);
  }

  littleComments(x:number){
    return this.http.get(this.LITTLE_COMMENT_URL + x);
  }

  bigComments(x:number){
    return this.http.get(this.BIG_COMMENT_URL + x);
  }


  posto(data:any){
    return this.http.post<any>(this.POST_OIL, data).pipe(catchError(this.errorHander));
  }

  postm(data:any){
    return this.http.post<any>(this.POST_MASK, data).pipe(catchError(this.errorHander));
  }

  postr(data:any){
    return this.http.post<any>(this.POST_REG, data).pipe(catchError(this.errorHander));
  }

  postds(data:any){
    return this.http.post<any>(this.POST_DS, data).pipe(catchError(this.errorHander));
  }

  postdsw(data:any){
    return this.http.post<any>(this.POST_DSW, data).pipe(catchError(this.errorHander));
  }



  errorHander(error: HttpErrorResponse) {
    return throwError(error);
  }

  
}
