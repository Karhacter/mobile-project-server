package com.tranduckhanh.exercise02.service;

import java.util.UUID;

import com.tranduckhanh.exercise02.entity.ProductTag;

import java.util.List;

public interface ProductTagService {
    List<ProductTag> getAllProductTags();

    ProductTag getProductTagById(UUID tagId, UUID productId);

    ProductTag createProductTag(ProductTag productTag);

    ProductTag updateProductTag(UUID tagId, UUID productId, ProductTag productTag);

    void deleteProductTag(UUID tagId, UUID productId);

}
