package com.systemorders.domain.controllers;

import com.systemorders.domain.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
         User user = new User(1L, "abc", "def", "ghi", "jkl");
         return ResponseEntity.ok().body(user);
    }
}
