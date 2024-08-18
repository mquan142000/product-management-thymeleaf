package com.example.productmanagementthymeleaf.service;

import com.example.productmanagementthymeleaf.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

    List<Product> findProduct(String name);
}
