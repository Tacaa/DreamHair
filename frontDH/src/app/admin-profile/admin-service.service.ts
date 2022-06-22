import { Injectable } from '@angular/core';
import { Main } from '../../main'
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {

  readonly URL : string = Main.PATH + "user/";
  constructor(private http: HttpClient) { }

  getUser(){
    return this.http.get(this.URL);
  }
}
