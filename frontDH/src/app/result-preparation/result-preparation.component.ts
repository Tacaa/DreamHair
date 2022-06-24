import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-result-preparation',
  templateUrl: './result-preparation.component.html',
  styleUrls: ['./result-preparation.component.css']
})
export class ResultPreparationComponent implements OnInit {

  preparation = history.state.data.preparation;
  advices = history.state.data.advices;
  constructor() { 
    console.log(this.preparation)
    console.log(this.advices);
  }

  ngOnInit(): void {
  }

}
