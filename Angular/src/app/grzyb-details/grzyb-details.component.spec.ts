import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrzybDetailsComponent } from './grzyb-details.component';

describe('GrzybDetailsComponent', () => {
  let component: GrzybDetailsComponent;
  let fixture: ComponentFixture<GrzybDetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GrzybDetailsComponent]
    });
    fixture = TestBed.createComponent(GrzybDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
