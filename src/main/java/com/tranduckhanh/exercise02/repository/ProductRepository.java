package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tranduckhanh.exercise02.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findProductsByTagsTagId(UUID tagId);
}
