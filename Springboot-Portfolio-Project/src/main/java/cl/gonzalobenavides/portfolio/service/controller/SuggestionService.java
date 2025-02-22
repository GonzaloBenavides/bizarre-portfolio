package cl.gonzalobenavides.portfolio.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gonzalobenavides.portfolio.model.Suggestion;
import cl.gonzalobenavides.portfolio.model.dao.SuggestionDAO;

@Service
public class SuggestionService implements SuggestionServiceInterface {

	private @Autowired SuggestionDAO sug;
	private @Autowired VisitorServiceInterface visitor;

	public Suggestion add(Suggestion suggestion) {
		
		visitor.add(suggestion.getVisitor());
		return sug.save(suggestion);
	}
	
	
}
