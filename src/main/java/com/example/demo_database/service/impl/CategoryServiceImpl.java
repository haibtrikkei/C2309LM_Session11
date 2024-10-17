package com.example.demo_database.service.impl;

import com.example.demo_database.model.entity.Category;
import com.example.demo_database.repository.CategoryRepository;
import com.example.demo_database.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
