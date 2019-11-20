import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AcdashboardComponent } from './acdashboard.component';

describe('AcdashboardComponent', () => {
  let component: AcdashboardComponent;
  let fixture: ComponentFixture<AcdashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AcdashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AcdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
