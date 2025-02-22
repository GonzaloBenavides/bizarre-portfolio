package cl.gonzalobenavides.portfolio.model.dao;

import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import cl.gonzalobenavides.portfolio.model.Suggestion;

@Component
public interface SuggestionDAO extends JpaRepository<Suggestion, Long>{
    
}
