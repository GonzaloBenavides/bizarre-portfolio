package cl.gonzalobenavides.portfolio.service.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.gonzalobenavides.portfolio.model.Suggestion;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SuggestionController {

	@Autowired
	SuggestionServiceInterface service;
	

	@GetMapping(path = "/api/add/suggestion")
	public String getMethodName(@RequestBody Suggestion suggestion) {
		return new String();
	}
	

	@PostMapping(path = "/api/add/suggestion")
	public ResponseEntity<?> addSuggestion(@RequestBody Suggestion suggestion, BindingResult result) {

		System.out.println("Receiving suggestion!");
		if(suggestion.getVisitor() != null){
			System.out.println("From : " + suggestion.getVisitor().getFullName());
			System.out.println("Email : " + suggestion.getVisitor().getEmail());
		}
		Map<String,Object> response = new HashMap<>();
		
		if(suggestion.getSuggestionText().isEmpty() || suggestion.getSuggestionText() == null) {
			response.put("error", "There's no suggestion in the suggestion box!");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		if(suggestion.getVisitor().getEmail().isEmpty() || suggestion.getVisitor().getEmail() == null) {
			response.put("error", "There's no email, how would I thank you?");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		if(suggestion.getVisitor().getFullName().isEmpty() || suggestion.getVisitor().getFullName() == null) {
			response.put("error", "There's no name, how would I call you?");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		Long init = new Date().getTime();
		Long end = 0L;
		try {
			
			System.out.println("Suggestion saving process init");
			Suggestion resSuggestion = service.add(suggestion);
			response.put("message", "Thanks for the suggestion, I'll add it to my to-do list: "
                    .concat(resSuggestion.getVisitor().getFullName()));
            response.put("suggestion", resSuggestion);

			end = new Date().getTime();
			System.out.println("Suggestion saving process finish at " + (end - init) + "ms");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch(DataAccessException dae) {
			response.put("error", "An internal error ocurred while executing the operation: "
				.concat(dae.getMostSpecificCause().getMessage()));
			System.out.println("Suggestion saving process error at " + (end - init) + "ms");
			return new ResponseEntity<Map<String,Object>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch(Exception e){
			response.put("error", "There was an unknown error, huh: ".concat(e.getMessage()));
			System.out.println("Suggestion saving process error at " + (end - init) + "ms");
			return new ResponseEntity<Map<String,Object>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
