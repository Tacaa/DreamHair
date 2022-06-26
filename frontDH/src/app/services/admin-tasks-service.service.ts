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
  readonly LITTLE_GRADES_URL : string = Main.PATH + "admin/littleComment/2";
  readonly INPUT_DIARY_URL : string = Main.PATH + "diary/";

  constructor
  (
    private router: Router,
    private http: HttpClient
  ) { }

  products(){
    return this.http.get(this.GIVE_PRODUCTS);
  }

  littleGrades(){
    return this.http.get(this.LITTLE_GRADES_URL);
  }


  
}
