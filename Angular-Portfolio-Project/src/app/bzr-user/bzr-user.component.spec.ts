import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BzrUserComponent } from './bzr-user.component';

describe('BzrUserComponent', () => {
  let component: BzrUserComponent;
  let fixture: ComponentFixture<BzrUserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BzrUserComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BzrUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
