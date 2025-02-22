package cl.gonzalobenavides.portfolio.service.controller;

import cl.gonzalobenavides.portfolio.model.User;
import cl.gonzalobenavides.portfolio.model.dao.UserDAO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginServiceInterface {

    @Autowired
    public UserDAO userDao;

    public UserDetails loginUserByEmail(String email){
        Optional<User> userOptional = userDao.findByEmail(email);
        User user = new User();
        if(!userOptional.isPresent())
            throw new UsernameNotFoundException(String.format("This email, %s, does not exist!", email));
        else 
            user = userOptional.get();

        List<GrantedAuthority> auth = user.getRoles().stream()
            .map( role -> new SimpleGrantedAuthority(role.getRol()))
            .collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), auth);
    }

    

}