import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginContentComponent } from './login-content.component';

describe('ContentComponent', () => {
  let component: LoginContentComponent;
  let fixture: ComponentFixture<LoginContentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LoginContentComponent]
    });
    fixture = TestBed.createComponent(LoginContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
