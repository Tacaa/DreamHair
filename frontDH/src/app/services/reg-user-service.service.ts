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
  readonly ADVICES_URL : string = Main.PATH + "hair/advices";

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


}
