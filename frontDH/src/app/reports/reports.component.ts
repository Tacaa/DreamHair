import { Component, OnInit } from '@angular/core';
import { AdminTasksServiceService } from '../services/admin-tasks-service.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-reports',
  templateUrl: './reports.component.html',
  styleUrls: ['./reports.component.css']
})
export class ReportsComponent implements OnInit {

  displayedColumns = ['position', 'name', 'rating', 'comments'];

  less_grade: any;
  more_grade: any;
  less_comments: any;
  more_comments: any;

  less_grade_form:FormGroup;
  more_grade_form:FormGroup;
  less_comment_form:FormGroup;
  more_comment_form:FormGroup;

  fleg1:boolean = true;
  fleg2:boolean = false;
  fleg3:boolean = true;
  fleg4:boolean = false;
  fleg5:boolean = true;
  fleg6:boolean = false;
  fleg7:boolean = true;
  fleg8:boolean = false;


  constructor(private service:AdminTasksServiceService, private fb: FormBuilder, private router: Router) { 
    this.less_grade_form = this.fb.group({
      grade: ['', Validators.required],
    });
    this.more_grade_form= this.fb.group({
      grade: ['', Validators.required],
    });
    this.less_comment_form= this.fb.group({
      grade: ['', Validators.required],
    });
    this.more_comment_form= this.fb.group({
      grade: ['', Validators.required],
    });
  }

  ngOnInit(): void {
  }


  profile(){
    this.router.navigate(['/AdminProfile']);
  }

  less_grade_click(){
    console.log(this.less_grade_form.value.grade)
    this.service.littleGrades(this.less_grade_form.value.grade).subscribe((data:any) => {
      console.log(data)
      this.less_grade = data
    });
    this.fleg1 = false;
    this.fleg2 = true;
    this.less_grade_form.reset()
  }

  more_grade_click(){
    this.service.bigGrades(this.more_grade_form.value.grade).subscribe((data:any) => {
      console.log(data);
      this.more_grade = data
    });
    this.fleg3 = false;
    this.fleg4 = true;
    this.more_grade_form.reset();
  }

  less_comment_click(){
    this.service.littleComments(this.less_comment_form.value.grade).subscribe((data:any) => {
      console.log(data);
      this.less_comments = data
    });
    this.fleg5 = false;
    this.fleg6 = true;
    this.less_comment_form.reset();
  }

  more_comment_click(){
    this.service.bigComments(this.more_comment_form.value.grade).subscribe((data:any) => {
      console.log(data);
      this.more_comments = data
    });
    this.fleg7 = false;
    this.fleg8 = true;
    this.more_comment_form.reset();
  
  }


  resetuj(){
    this.fleg1 = true;
    this.fleg2 = false;
    this.fleg3 = true;
    this.fleg4 = false;
    this.fleg5 = true;
    this.fleg6 = false;
    this.fleg7 = true;
    this.fleg8 = false;
  }
}
