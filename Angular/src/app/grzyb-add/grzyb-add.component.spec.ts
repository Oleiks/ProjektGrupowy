import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrzybAddComponent } from './grzyb-add.component';

describe('GrzybAddComponent', () => {
  let component: GrzybAddComponent;
  let fixture: ComponentFixture<GrzybAddComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GrzybAddComponent]
    });
    fixture = TestBed.createComponent(GrzybAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
