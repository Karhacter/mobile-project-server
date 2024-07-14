package com.tranduckhanh.exercise02.service;

import java.util.List;
import java.util.UUID;

import com.tranduckhanh.exercise02.entity.Product;

public interface ProductService {
    List<Product> findProductsByTagId(UUID tagId);

    List<Product> getAllProducts();

    Product getProductById(UUID id);

    Product createProduct(Product product);

    Product updateProduct(UUID id, Product product);

    void deleteProduct(UUID id);
}
