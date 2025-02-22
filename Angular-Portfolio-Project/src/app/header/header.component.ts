import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  public dropdownItem = [
    { name: 'Components', activo: '', route: 'components' },
    { name: 'About Me', activo: '', route: '' },
    { name: 'Suggestion Box', activo: '', route: 'suggestions' }
  ]



}
