import { Component, OnInit } from '@angular/core';
import { RegUserServiceService } from '../services/reg-user-service.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-diary',
  templateUrl: './diary.component.html',
  styleUrls: ['./diary.component.css']
})
export class DiaryComponent implements OnInit {
  displayedColumns = ['position', 'name'];
  form: FormGroup;

  wash_dataSource: any;
  mjerenje_dataSource: any;
  stanja_dataSource: any;
  komentari_dataSource: any;

  constructor(private service:RegUserServiceService, private fb: FormBuilder, private router:Router) {
    this.form = this.fb.group({
      pranje: [''],
      mjerenje: [''],
      opis: [''],
      komentar: [''],
    });

    this.service.getDiary().subscribe((data:any) => {
      console.log(data);
      this.wash_dataSource = data.hairWash
      this.mjerenje_dataSource =data.hairGrowth
      this.stanja_dataSource =data.hairState
      this.komentari_dataSource =data.comments
    });
   }

  ngOnInit(): void {
  }

  salji(){
    console.log(this.form.value);

    
    const send = {
      hairWash : this.form.value.pranje,
	    hairGrowth : this.form.value.mjerenje,
	    hairState : this.form.value.opis,
	    comment: this.form.value.komentar
    }

    this.service.postDiary(send)
    .subscribe(
      data => {
        console.log(data);
        this.wash_dataSource = data.hairWash
        this.mjerenje_dataSource =data.hairGrowth
        this.stanja_dataSource =data.hairState
        this.komentari_dataSource =data.comments
      },
      error => {
        console.log("Neki error se desio");
        console.log(error)
      });
    
      this.form.reset();
  }

  profile(){
    this.router.navigate(['/UserProfileComponent']);
  }


  
  
}
