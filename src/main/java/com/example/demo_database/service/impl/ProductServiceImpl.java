package com.example.demo_database.service.impl;

import com.example.demo_database.model.entity.Product;
import com.example.demo_database.repository.ProductRepository;
import com.example.demo_database.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void insert(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Integer proId) {
        productRepository.deleteById(proId);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }
}
