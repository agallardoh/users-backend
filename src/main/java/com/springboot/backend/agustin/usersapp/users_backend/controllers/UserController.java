package com.springboot.backend.agustin.usersapp.users_backend.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.agustin.usersapp.users_backend.entities.User;
import com.springboot.backend.agustin.usersapp.users_backend.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping    
    public List<User> list(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Optional<User>  userOptional = service.findById(id);
        if(userOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(userOptional.orElseThrow());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonMap("error", "el usuario no se encontro por el id:" + id));
    }
    
}
