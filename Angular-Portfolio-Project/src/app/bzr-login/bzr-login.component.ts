import { Component } from '@angular/core';
import { User } from '../model/user';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginService } from './loginService';

@Component({
  selector: 'app-bzr-login',
  templateUrl: './bzr-login.component.html',
  styleUrls: ['./bzr-login.component.css']
})
export class BzrLoginComponent {
  
  public user : User = new User();  
  public errorArray : string[];

  constructor(private loginService: LoginService, private router: Router, private activatedRouter: ActivatedRoute) { }

  login(): void{
    this.router.navigate(['/profile']);
    this.loginService.sendLogin(this.user).subscribe({error: (e) => this.errorArray = e.error.errors as string[]});
  }
}
