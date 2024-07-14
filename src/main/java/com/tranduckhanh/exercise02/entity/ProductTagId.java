package com.tranduckhanh.exercise02.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class ProductTagId implements Serializable {
    private UUID productId;
    private UUID tagId;

    public ProductTagId() {
    }

    public ProductTagId(UUID productId, UUID tagId) {
        this.productId = productId;
        this.tagId = tagId;
    }

    // Getters and Setters
    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public UUID getTagId() {
        return tagId;
    }

    public void setTagId(UUID tagId) {
        this.tagId = tagId;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ProductTagId that = (ProductTagId) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, tagId);
    }
}
