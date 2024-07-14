package com.tranduckhanh.exercise02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tranduckhanh.exercise02.entity.ProductCategory;
import com.tranduckhanh.exercise02.service.ProductCategoryService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/product-categories")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping
    public ResponseEntity<List<ProductCategory>> getAllProductCategories() {
        List<ProductCategory> productCategories = productCategoryService.getAllProductCategories();
        return new ResponseEntity<>(productCategories, HttpStatus.OK);
    }

    @GetMapping("/{categoryId}/{productId}")
    public ResponseEntity<ProductCategory> getProductCategoryById(@PathVariable("categoryId") UUID categoryId,
            @PathVariable("productId") UUID productId) {
        ProductCategory productCategory = productCategoryService.getProductCategoryById(categoryId, productId);
        if (productCategory != null) {
            return new ResponseEntity<>(productCategory, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ProductCategory> createProductCategory(@RequestBody ProductCategory productCategory) {
        // Nếu muốn cho phép thêm mới categoryId đã tồn tại, bạn có thể bỏ qua bước kiểm
        // tra

        // Thực hiện thêm ProductCategory mới
        ProductCategory createdProductCategory = productCategoryService.createProductCategory(productCategory);
        return new ResponseEntity<>(createdProductCategory, HttpStatus.CREATED);
    }

    @PutMapping("/{categoryId}/{productId}")
    public ResponseEntity<ProductCategory> updateProductCategory(@PathVariable("categoryId") UUID categoryId,
            @PathVariable("productId") UUID productId, @RequestBody ProductCategory productCategory) {
        ProductCategory updatedProductCategory = productCategoryService.updateProductCategory(categoryId, productId,
                productCategory);
        if (updatedProductCategory != null) {
            return new ResponseEntity<>(updatedProductCategory, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{categoryId}/{productId}")
    public ResponseEntity<Void> deleteProductCategory(@PathVariable UUID categoryId, @PathVariable UUID productId) {
        productCategoryService.deleteProductCategory(categoryId, productId);
        return ResponseEntity.noContent().build();
    }
}
