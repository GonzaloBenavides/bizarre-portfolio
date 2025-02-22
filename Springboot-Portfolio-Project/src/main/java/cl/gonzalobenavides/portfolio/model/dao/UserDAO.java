package cl.gonzalobenavides.portfolio.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import cl.gonzalobenavides.portfolio.model.Rol;
import cl.gonzalobenavides.portfolio.model.User;
import java.util.List;
import java.util.Optional;


@Component
public interface UserDAO  extends JpaRepository<User,Long>{


    public Optional<User> findByEmail(String email);

    public List<Rol> findRolesById(Long id);

}
