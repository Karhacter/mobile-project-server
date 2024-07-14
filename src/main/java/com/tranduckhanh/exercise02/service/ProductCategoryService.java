package com.tranduckhanh.exercise02.service;

import java.util.List;
import java.util.UUID;

import com.tranduckhanh.exercise02.entity.ProductCategory;

public interface ProductCategoryService {
    List<ProductCategory> getAllProductCategories();

    ProductCategory getProductCategoryById(UUID categoryId, UUID productId);

    ProductCategory createProductCategory(ProductCategory productCategory);

    ProductCategory updateProductCategory(UUID categoryId, UUID productId, ProductCategory productCategory);

    void deleteProductCategory(UUID categoryId, UUID productId);
}
