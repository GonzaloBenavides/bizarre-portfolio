package cl.gonzalobenavides.portfolio.service.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.gonzalobenavides.portfolio.model.User;

@RestController
public class UserController {

    @Autowired
    UserServiceInterface service;

    @PostMapping(path = "login")
    public ResponseEntity<?> logUser(@RequestBody User user, BindingResult result){
        System.out.println("A user is trying to log in! ");
        Map<String,Object> response = new HashMap<>();
        //check if exist

        //respose invalid
        response.put("error","Invalid user. Do not try again.");
        return new ResponseEntity<Map<String,Object>>(response, HttpStatus.FORBIDDEN);
        //response valid
    }    
    
}
