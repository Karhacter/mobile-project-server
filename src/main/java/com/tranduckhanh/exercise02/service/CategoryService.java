package com.tranduckhanh.exercise02.service;

import java.util.List;
import java.util.UUID;

import com.tranduckhanh.exercise02.entity.Category;

public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(UUID id);

    Category createCategory(Category category);

    Category updateCategory(UUID id, Category category);

    void deleteCategory(UUID id);

    boolean existsById(UUID id);
}
