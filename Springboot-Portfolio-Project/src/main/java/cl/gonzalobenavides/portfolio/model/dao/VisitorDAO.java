package cl.gonzalobenavides.portfolio.model.dao;

import org.springframework.stereotype.Component;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.gonzalobenavides.portfolio.model.Visitor;

@Component
public interface VisitorDAO extends JpaRepository<Visitor, Long>{
    
    public Visitor findByEmail(String email);
}
