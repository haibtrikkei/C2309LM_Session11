package com.example.demo_database.controller;

import com.example.demo_database.model.entity.Category;
import com.example.demo_database.model.entity.Product;
import com.example.demo_database.service.CategoryService;
import com.example.demo_database.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String listProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("list", products);
        return "product/products";
    }

    @GetMapping("/initAddProduct")
    public String initAddProduct(Model model) {
        model.addAttribute("product", new Product());
        List<Category> allCategories = categoryService.getAllCategories();
        model.addAttribute("categories", allCategories);
        return "product/addProduct";
    }

    @PostMapping("/insertProduct")
    public String insertProduct(@ModelAttribute Product product, Model model) {
        productService.insert(product);
        return "redirect:/products";
    }
}
