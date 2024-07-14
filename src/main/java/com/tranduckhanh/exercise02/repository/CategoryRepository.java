package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

import com.tranduckhanh.exercise02.entity.Category;

@Repository

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
