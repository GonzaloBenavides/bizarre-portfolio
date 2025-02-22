import { Component } from '@angular/core';
import { formatDate } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';
import { EmailValidator } from '@angular/forms';
import { Suggest } from '../model/suggest';
import { SuggestionService } from './suggestionService';

@Component({
  selector: 'app-bzr-suggestions',
  templateUrl: './bzr-suggestions.component.html',
  styleUrls: ['./bzr-suggestions.component.css']
})
export class BzrSuggestionsComponent {

  public suggest: Suggest = new Suggest();
  public errorArray: string[];



  constructor(private suggestionService: SuggestionService, private router: Router) { }

  ngOnInit() {
    this.suggest.createAt = formatDate(new Date(), 'yyyy-MM-dd', 'es-CL');
  }

  add(): void {
    this.router.navigate(['/suggestions']);
    this.suggestionService.addSuggestion(this.suggest).subscribe({error: (e) => this.errorArray = e.error.errors as string[]});
  }
}
