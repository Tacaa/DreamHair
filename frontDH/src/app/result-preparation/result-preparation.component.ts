import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-result-preparation',
  templateUrl: './result-preparation.component.html',
  styleUrls: ['./result-preparation.component.css']
})
export class ResultPreparationComponent implements OnInit {
  displayedColumns = ['position', 'name'];

  oil_dataSource: any;
  mask_dataSource: any;
  reg_dataSource: any;
  ds_dataSource: any;
  dws_dataSource: any;
  advice_dataSource: any;


  preparation = history.state.data.preparation;
  advices = history.state.data.advices;
  constructor(private router: Router) { 
    this.oil_dataSource =this.preparation.oils
    this.mask_dataSource =this.preparation.masks
    this.reg_dataSource =this.preparation.regenerators
    this.ds_dataSource =this.preparation.dailyShampoos
    this.dws_dataSource =this.preparation.deepWashShampoos
    this.advice_dataSource = [this.advices.firstAdvice, this.advices.secondAdvice, this.advices.thirdAdvice]
    //console.log(this.preparation)
    //console.log(this.advices);
  }


  
  ngOnInit(): void {
  }


  profile(){
    this.router.navigate(['/UserProfileComponent']);
  }
}


