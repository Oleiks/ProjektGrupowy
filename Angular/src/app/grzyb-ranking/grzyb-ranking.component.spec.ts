import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrzybRankingComponent } from './grzyb-ranking.component';

describe('GrzybRankingComponent', () => {
  let component: GrzybRankingComponent;
  let fixture: ComponentFixture<GrzybRankingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GrzybRankingComponent]
    });
    fixture = TestBed.createComponent(GrzybRankingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
