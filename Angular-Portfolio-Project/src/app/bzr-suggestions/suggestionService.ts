import { HttpClient, HttpEvent, HttpHeaders, HttpRequest } from '@angular/common/http';
import { Router } from '@angular/router';
import { catchError, Observable } from 'rxjs';

import { Suggest } from '../model/suggest';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn:'root'
})
export class SuggestionService {

    private urlEndpoint: string = 'http://localhost:8080/api/';
    private endpointAction: string = '';

    private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

    constructor(private http: HttpClient, private router: Router) { }

    addSuggestion(sug: Suggest): Observable<any> {
        this.endpointAction = 'add/suggestion';
        return this.http.post<Suggest>(this.urlEndpoint+this.endpointAction, sug, { headers: this.httpHeaders }).pipe(catchError(e => { throw e }));
    }
}