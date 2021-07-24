package com.systemorders.domain.controllers;

import com.systemorders.domain.entities.Product;
import com.systemorders.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService ProductService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = ProductService.findAll();
         return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = ProductService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
