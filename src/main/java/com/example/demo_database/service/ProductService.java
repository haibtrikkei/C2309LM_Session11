package com.example.demo_database.service;

import com.example.demo_database.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void insert(Product product);
    void delete(Integer proId);
    void update(Product product);

}
