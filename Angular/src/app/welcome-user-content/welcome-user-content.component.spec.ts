import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WelcomeUserContentComponent } from './welcome-user-content.component';

describe('WelcomeUserContentComponent', () => {
  let component: WelcomeUserContentComponent;
  let fixture: ComponentFixture<WelcomeUserContentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [WelcomeUserContentComponent]
    });
    fixture = TestBed.createComponent(WelcomeUserContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
