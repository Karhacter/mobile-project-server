package com.tranduckhanh.exercise02.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tranduckhanh.exercise02.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, UUID> {
    List<Tag> findTagByProductsProductId(UUID productId);
}
