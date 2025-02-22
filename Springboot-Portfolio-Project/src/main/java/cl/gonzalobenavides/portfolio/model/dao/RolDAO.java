package cl.gonzalobenavides.portfolio.model.dao;

import cl.gonzalobenavides.portfolio.model.Rol;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RolDAO extends JpaRepository<Rol, Long> {
    
}
