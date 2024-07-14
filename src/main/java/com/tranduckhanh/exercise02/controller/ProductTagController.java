package com.tranduckhanh.exercise02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tranduckhanh.exercise02.entity.ProductTag;
import com.tranduckhanh.exercise02.service.ProductTagService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/product-tags")
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:3001" }, maxAge = 3600)
public class ProductTagController {
    @Autowired
    private ProductTagService productTagService;

    @GetMapping
    public ResponseEntity<List<ProductTag>> getAllProductTags() {
        List<ProductTag> productTags = productTagService.getAllProductTags();
        return new ResponseEntity<>(productTags, HttpStatus.OK);
    }

    @GetMapping("/{tagId}/{productId}")
    public ResponseEntity<ProductTag> getProductTagById(@PathVariable UUID tagId, @PathVariable UUID productId) {
        ProductTag productTag = productTagService.getProductTagById(tagId, productId);
        return ResponseEntity.ok(productTag);
    }

    @PostMapping
    public ResponseEntity<ProductTag> createProductTag(@RequestBody ProductTag productTag) {
        ProductTag newProductTag = productTagService.createProductTag(productTag);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProductTag);
    }

    @PutMapping("/{tagId}/{productId}")
    public ResponseEntity<ProductTag> updateProductTag(@PathVariable UUID tagId, @PathVariable UUID productId,
            @RequestBody ProductTag productTag) {
        ProductTag updatedProductTag = productTagService.updateProductTag(tagId, productId, productTag);
        return ResponseEntity.ok(updatedProductTag);
    }

    @DeleteMapping("/{tagId}/{productId}")
    public ResponseEntity<Void> deleteProductTag(@PathVariable UUID tagId, @PathVariable UUID productId) {
        productTagService.deleteProductTag(tagId, productId);
        return ResponseEntity.noContent().build();
    }
}
