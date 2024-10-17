package com.example.demo_database.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Column(name = "product_name", length = 100)
    private String productName;
    @Column(name = "producer")
    private String producer;
    @Column(name = "yearMaking")
    private Integer yearMaking;
    @Column(name = "expire_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expireDate;
    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "cate_id", referencedColumnName = "cate_id")
    private Category category;
}
