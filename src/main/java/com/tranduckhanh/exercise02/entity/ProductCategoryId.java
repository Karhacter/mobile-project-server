package com.tranduckhanh.exercise02.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class ProductCategoryId implements Serializable {
    private UUID productId;
    private UUID categoryId;

    public ProductCategoryId() {
    }

    public ProductCategoryId(UUID productId, UUID categoryId) {
        this.productId = productId;
        this.categoryId = categoryId;
    }

    // Getters and Setters
    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public UUID getTagId() {
        return categoryId;
    }

    public void setTagId(UUID tagId) {
        this.categoryId = categoryId;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ProductCategoryId that = (ProductCategoryId) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, categoryId);
    }
}
