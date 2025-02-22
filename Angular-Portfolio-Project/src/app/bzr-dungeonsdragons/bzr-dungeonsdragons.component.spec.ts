import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BzrDungeonsdragonsComponent } from './bzr-dungeonsdragons.component';

describe('BzrDungeonsdragonsComponent', () => {
  let component: BzrDungeonsdragonsComponent;
  let fixture: ComponentFixture<BzrDungeonsdragonsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BzrDungeonsdragonsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BzrDungeonsdragonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
