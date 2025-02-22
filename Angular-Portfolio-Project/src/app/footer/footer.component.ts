import { Component } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent {

  public contacto: any = {
    nombre : 'Gonzalo',
    apellidos : 'Benavides Coloma',
    email : "gonzalo.benavides.bf@gmail.com",
    fono : 65706696
  }
  
}
