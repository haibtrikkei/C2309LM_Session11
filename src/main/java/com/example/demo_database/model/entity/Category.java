package com.example.demo_database.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @Column(name = "cate_id")
    private String cateId;
    @Column(name = "cate_name",length = 100, nullable = false, unique = true)
    private String cateName;

    @OneToMany(mappedBy = "category")
    private List<Product> productList;
}
