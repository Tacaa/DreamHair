import { TestBed } from '@angular/core/testing';

import { AdminTasksServiceService } from './admin-tasks-service.service';

describe('AdminTasksServiceService', () => {
  let service: AdminTasksServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminTasksServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
