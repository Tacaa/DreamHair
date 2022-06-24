import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResultPreparationComponent } from './result-preparation.component';

describe('ResultPreparationComponent', () => {
  let component: ResultPreparationComponent;
  let fixture: ComponentFixture<ResultPreparationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResultPreparationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ResultPreparationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
