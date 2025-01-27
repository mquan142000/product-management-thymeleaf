package com.example.productmanagementthymeleaf.service;

import com.example.productmanagementthymeleaf.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Product 1", 100.0, 10));
        products.put(2, new Product(2, "Product 2", 200.0, 5));
        products.put(3, new Product(3, "Product 3", 300.0, 20));
        products.put(4, new Product(4, "Product 4", 400.0, 15));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findProduct(String name) {
        return (List<Product>) products.get(name);
    }
}
