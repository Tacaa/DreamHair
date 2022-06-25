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
import { UserInputComponent } from './user-input/user-input.component';
import { ResultPreparationComponent } from './result-preparation/result-preparation.component';
import { PreparationComponent } from './preparation/preparation.component';
import { DiaryComponent } from './diary/diary.component';
import { DiaryResultComponent } from './diary-result/diary-result.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminProfileComponent,
    RegistrationComponent,
    UserProfileComponent,
    UserInputComponent,
    ResultPreparationComponent,
    PreparationComponent,
    DiaryComponent,
    DiaryResultComponent,
    
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
      {
        path: 'RegistrationComponent',
        component: RegistrationComponent,
      },
      {
        path: 'UserInputComponent',
        canActivate: [UserRoutes],
        component: UserInputComponent,
      },
      {
        path: 'ResultPreparationComponent',
        canActivate: [UserRoutes],
        component: ResultPreparationComponent,
      },
      {
        path: 'PreparationComponent',
        canActivate: [UserRoutes],
        component: PreparationComponent,
      },
      {
        path: 'DiaryComponent',
        canActivate: [UserRoutes],
        component: DiaryComponent,
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
