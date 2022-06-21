import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule  } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AngularMaterialModule } from './angular_material.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';

import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { TokenInterceptor } from './home/TokenInterceptor';
import { HomeServiceService } from './home/home-service.service';
import { AdminProfileComponent } from './admin-profile/admin-profile.component';
import { RegistrationComponent } from './registration/registration.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { AdminRoutes } from './user-routes/AdminRoutes';
import { UserRoutes } from './user-routes/UserRoutes';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminProfileComponent,
    RegistrationComponent,
    UserProfileComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    AngularMaterialModule,
    FormsModule,
    ReactiveFormsModule,

    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      {
        path: 'AdminProfile',
        canActivate: [AdminRoutes],
        component: AdminProfileComponent,
      },
      {
        path: 'UserProfileComponent',
        canActivate: [UserRoutes],
        component: UserProfileComponent,
      },
    ]),
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: TokenInterceptor,
      multi: true,
    },
  
    HomeServiceService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 
}
