package com.tranduckhanh.exercise02.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranduckhanh.exercise02.entity.Product;

import com.tranduckhanh.exercise02.repository.ProductRepository;
import com.tranduckhanh.exercise02.service.ProductService;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(UUID id, Product product) {
        if (!productRepository.existsById(id)) {
            return null; // or throw an exception
        }
        product.setProductId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findProductsByTagId(UUID tagId) {
        // TODO Auto-generated method stub
        List<Product> products = productRepository.findProductsByTagsTagId(tagId);
        return products;
    }
}
