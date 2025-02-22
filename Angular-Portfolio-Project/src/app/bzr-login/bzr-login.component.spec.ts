import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BzrLoginComponent } from './bzr-login.component';

describe('BzrLoginComponent', () => {
  let component: BzrLoginComponent;
  let fixture: ComponentFixture<BzrLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BzrLoginComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BzrLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
