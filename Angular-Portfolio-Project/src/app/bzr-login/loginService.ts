import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Router } from "@angular/router";
import { catchError, Observable } from "rxjs";
import { User } from "../model/user";

export class LoginService {

    private urlEndpoint : string = 'http://localhost:8080/api/';
    private endpointAction: string = '';

    private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

    constructor(private http: HttpClient, private router : Router) {}

    sendLogin(us : User) : Observable <any> {
        this.endpointAction = 'login';
        this.router.navigate(['/profile']);
        return this.http.post<User>(this.urlEndpoint+this.endpointAction, us, { headers: this.httpHeaders}).pipe(catchError(e => {throw e}));
    }
}