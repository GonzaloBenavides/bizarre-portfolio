import { Component } from '@angular/core';
import { trigger, transition} from '@angular/animations';
import { throwDice } from '../animations/throw.animation';

@Component({
  selector: 'app-bzr-dungeonsdragons',
  templateUrl: './bzr-dungeonsdragons.component.html',
  styleUrls: ['./bzr-dungeonsdragons.component.css'],
  animations: [
    trigger('throw',[
      transition('false => true', [
        throwDice
      ])
    ])
  ]
})
export class BzrDungeonsdragonsComponent {

  throwState : boolean = false;

  throw() {
    this.throwState = true;

  }
}