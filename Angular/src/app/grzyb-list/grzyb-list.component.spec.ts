import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrzybListComponent } from './grzyb-list.component';

describe('GrzybListComponent', () => {
  let component: GrzybListComponent;
  let fixture: ComponentFixture<GrzybListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GrzybListComponent]
    });
    fixture = TestBed.createComponent(GrzybListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
