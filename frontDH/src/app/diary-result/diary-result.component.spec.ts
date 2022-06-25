import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DiaryResultComponent } from './diary-result.component';

describe('DiaryResultComponent', () => {
  let component: DiaryResultComponent;
  let fixture: ComponentFixture<DiaryResultComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DiaryResultComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DiaryResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
