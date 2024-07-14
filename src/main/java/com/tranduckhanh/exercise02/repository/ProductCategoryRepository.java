package com.tranduckhanh.exercise02.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.tranduckhanh.exercise02.entity.ProductCategory;
import com.tranduckhanh.exercise02.entity.ProductCategoryId;

@Repository
public class ProductCategoryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveProductCategory(ProductCategory productCategory) {
        entityManager.persist(productCategory);
    }

    @Transactional
    public void updateProductCategory(ProductCategory productCategory) {
        entityManager.merge(productCategory);
    }

    @Transactional
    public void deleteProductCategory(ProductCategory productCategory) {
        entityManager.remove(productCategory);
    }

    public ProductCategory getProductCategoryById(UUID tagId, UUID productId) {
        return entityManager.find(ProductCategory.class, new ProductCategoryId(productId, tagId));

    }

    public List<ProductCategory> getAllProductCategories() {
        return entityManager.createQuery("SELECT pt FROM ProductCategory pt", ProductCategory.class).getResultList();
    }
    // Các phương thức tìm kiếm tùy chỉnh khác có thể được thêm ở đây
}
