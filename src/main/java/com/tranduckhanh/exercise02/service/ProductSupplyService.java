package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.ProductSupply;

public interface ProductSupplyService {
    ProductSupply createProductSupply(ProductSupply product);

    ProductSupply getProductSupplyById(String productId);

    List<ProductSupply> getAllProductSupplys();

    ProductSupply updateProductSupply(ProductSupply product);

    void deleteProductSupply(String productId);
}