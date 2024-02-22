import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrzybRecognitionComponent } from './grzyb-recognition.component';

describe('GrzybRecognitionComponent', () => {
  let component: GrzybRecognitionComponent;
  let fixture: ComponentFixture<GrzybRecognitionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GrzybRecognitionComponent]
    });
    fixture = TestBed.createComponent(GrzybRecognitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
