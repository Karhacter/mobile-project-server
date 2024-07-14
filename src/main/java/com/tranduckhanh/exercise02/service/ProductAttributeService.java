package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.ProductAttribute;

public interface ProductAttributeService {
    ProductAttribute createProductAttribute(ProductAttribute productAttribute);

    ProductAttribute getProductAttributeById(String productAttributeId);

    List<ProductAttribute> getAllProductAttributes();

    ProductAttribute updateProductAttribute(ProductAttribute productAttribute);

    void deleteProductAttribute(String productAttributeId);
}