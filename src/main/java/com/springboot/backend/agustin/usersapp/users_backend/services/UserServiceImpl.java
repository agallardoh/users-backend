package com.springboot.backend.agustin.usersapp.users_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.agustin.usersapp.users_backend.entities.User;
import com.springboot.backend.agustin.usersapp.users_backend.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {

    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
      
    }

    @Override
    public User save(User user) {
      
    }

    @Override
    public void deleteById(Long id) {
       
    }

}
