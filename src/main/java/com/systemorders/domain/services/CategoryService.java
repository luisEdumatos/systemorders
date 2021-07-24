package com.systemorders.domain.services;

import com.systemorders.domain.entities.Category;
import com.systemorders.domain.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }
    public Category findById(Long id) {
        return  CategoryRepository.findById(id).get();
    }
}
