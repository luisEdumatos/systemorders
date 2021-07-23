package com.systemorders.domain.services;

import com.systemorders.domain.entities.User;
import com.systemorders.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Long id) {
        return  userRepository.findById(id).get();
    }
}
