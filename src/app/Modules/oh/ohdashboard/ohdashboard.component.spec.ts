import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OhdashboardComponent } from './ohdashboard.component';

describe('OhdashboardComponent', () => {
  let component: OhdashboardComponent;
  let fixture: ComponentFixture<OhdashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OhdashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OhdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
