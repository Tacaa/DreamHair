import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Main } from '../../main'

@Injectable({
  providedIn: 'root'
})
export class HomeServiceService {
  readonly URL : string = Main.PATH + "sample/proba";

  constructor(private http: HttpClient) { }

  proba() {
    return this.http.get(this.URL);
  }


}
