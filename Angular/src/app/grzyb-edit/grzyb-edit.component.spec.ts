import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrzybEditComponent } from './grzyb-edit.component';

describe('GrzybEditComponent', () => {
  let component: GrzybEditComponent;
  let fixture: ComponentFixture<GrzybEditComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GrzybEditComponent]
    });
    fixture = TestBed.createComponent(GrzybEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
