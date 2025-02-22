import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BzrSuggestionsComponent } from '../suggestions/suggestions.component';

describe('BzrSuggestionsComponent', () => {
  let component: BzrSuggestionsComponent;
  let fixture: ComponentFixture<BzrSuggestionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BzrSuggestionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BzrSuggestionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
