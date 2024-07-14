package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.ProductAttributeValue;

public interface ProductAttributeValueService {
    ProductAttributeValue createProductAttributeValue(ProductAttributeValue productAttributeValue);

    ProductAttributeValue getProductAttributeValueById(String productAttributeValueId);

    List<ProductAttributeValue> getAllProductAttributeValues();

    ProductAttributeValue updateProductAttributeValue(ProductAttributeValue productAttributeValue);

    void deleteProductAttributeValue(String productAttributeValueId);
}