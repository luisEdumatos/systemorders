package com.systemorders.domain.services;

import com.systemorders.domain.entities.Product;
import com.systemorders.domain.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }
    public Product findById(Long id) {
        return  ProductRepository.findById(id).get();
    }
}
