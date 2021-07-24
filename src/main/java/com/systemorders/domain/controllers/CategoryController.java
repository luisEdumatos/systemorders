package com.systemorders.domain.controllers;

import com.systemorders.domain.entities.Category;
import com.systemorders.domain.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = CategoryService.findAll();
         return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = CategoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
