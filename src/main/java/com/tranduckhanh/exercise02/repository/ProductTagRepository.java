package com.tranduckhanh.exercise02.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.tranduckhanh.exercise02.entity.ProductTag;
import com.tranduckhanh.exercise02.entity.ProductTagId;

@Repository
public class ProductTagRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveProductTag(ProductTag productTag) {
        entityManager.persist(productTag);
    }

    @Transactional
    public void updateProductTag(ProductTag productTag) {
        entityManager.merge(productTag);
    }

    @Transactional
    public void deleteProductTag(ProductTag productTag) {
        entityManager.remove(productTag);
    }

    public ProductTag getProductTagById(UUID tagId, UUID productId) {
        return entityManager.find(ProductTag.class, new ProductTagId(productId, tagId));

    }

    public List<ProductTag> getAllProductTags() {
        return entityManager.createQuery("SELECT pt FROM ProductTag pt", ProductTag.class).getResultList();
    }
    // Các phương thức tìm kiếm tùy chỉnh khác có thể được thêm ở đây
}
