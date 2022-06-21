import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpInterceptor,
  HttpEvent
} from '@angular/common/http';
import { HomeServiceService } from './home-service.service';

import { Observable } from 'rxjs/';

@Injectable()
export class TokenInterceptor implements HttpInterceptor {
  constructor(public auth: HomeServiceService) { }
  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    if (this.auth.tokenIsPresent()) {
      request = request.clone({
        setHeaders: {
          Authorization: `Bearer ${this.auth.getToken()}`
        }
      });
    }
    return next.handle(request);
  }
}