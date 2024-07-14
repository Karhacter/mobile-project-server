package com.tranduckhanh.exercise02.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranduckhanh.exercise02.entity.ProductCategory;
import com.tranduckhanh.exercise02.repository.ProductCategoryRepository;
import com.tranduckhanh.exercise02.service.ProductCategoryService;

import java.util.List;
import java.util.UUID;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    private static final Logger logger = LoggerFactory.getLogger(ProductTagServiceImpl.class);
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.getAllProductCategories();
    }

    @Override
    public ProductCategory getProductCategoryById(UUID categoryId, UUID productId) {
        return productCategoryRepository.getProductCategoryById(categoryId, productId);
    }

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
        productCategoryRepository.saveProductCategory(productCategory);
        return productCategory;
    }

    @Override
    public ProductCategory updateProductCategory(UUID categoryId, UUID productId, ProductCategory productCategory) {
        if (productCategoryRepository.getProductCategoryById(productId, categoryId) != null) {
            // return productTagRepository.updateProductTag(productTag);
        }
        return null;
    }

    @Override
    public void deleteProductCategory(UUID categoryId, UUID productId) {
        // Tìm đối tượng ProductTag dựa trên productId và tagId
        ProductCategory productCategory = productCategoryRepository.getProductCategoryById(categoryId, productId);
        // Kiểm tra xem productTag có tồn tại không trước khi xóa
        if (productCategory != null) {

            productCategoryRepository.deleteProductCategory(productCategory);

        } else {
            // Xử lý trường hợp khi không tìm thấy đối tượng ProductTag
            logger.warn("Không tìm thấy ProductTag với productId {} và tagId {} để xóa", productId, categoryId);
            // Có thể throw một exception hoặc thực hiện xử lý khác tùy vào yêu cầu của bạn
        }
    }
}
