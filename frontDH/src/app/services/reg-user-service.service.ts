import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse} from '@angular/common/http';
import { Main } from '../../main'
import { Router } from '@angular/router';
import { throwError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class RegUserServiceService {

  readonly CALCULATE_URL : string = Main.PATH + "hair/calculate";
  readonly REVIEWS_URL : string = Main.PATH + "hair/reviews";
  readonly ADVICES_URL : string = Main.PATH + "hair/advices";
  readonly GIVE_REVIEW_URL : string = Main.PATH + "hair/giveReview";
  readonly DIARY_URL : string = Main.PATH + "diary/";
  readonly INPUT_DIARY_URL : string = Main.PATH + "diary/";

  constructor
    (
      private router: Router,
      private http: HttpClient
    ) { }

  calculate(data: any) {
    return this.http.post<any>(this.CALCULATE_URL, data)
              .pipe(catchError(this.errorHander));
  }

  errorHander(error: HttpErrorResponse) {
    return throwError(error);
  }

  advices() {
    return this.http.get(this.ADVICES_URL);
  }

  giveReview(data:any){
    return this.http.post<any>(this.GIVE_REVIEW_URL, data).pipe(catchError(this.errorHander));
  }

  getReviews(){
    return this.http.get(this.REVIEWS_URL);
  }

  getDiary(){
    return this.http.get(this.DIARY_URL);
  }

  postDiary(data:any){
    return this.http.post<any>(this.INPUT_DIARY_URL, data).pipe(catchError(this.errorHander));
  }



}
