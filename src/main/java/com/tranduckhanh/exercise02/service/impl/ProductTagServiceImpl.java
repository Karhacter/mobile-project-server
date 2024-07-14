package com.tranduckhanh.exercise02.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranduckhanh.exercise02.entity.ProductTag;
import com.tranduckhanh.exercise02.repository.ProductTagRepository;
import com.tranduckhanh.exercise02.service.ProductTagService;

import java.util.List;
import java.util.UUID;

@Service
public class ProductTagServiceImpl implements ProductTagService {

    private static final Logger logger = LoggerFactory.getLogger(ProductTagServiceImpl.class);

    @Autowired
    private ProductTagRepository productTagRepository;

    @Override
    public List<ProductTag> getAllProductTags() {
        return productTagRepository.getAllProductTags();
    }

    @Override
    public ProductTag getProductTagById(UUID tagId, UUID productId) {
        return productTagRepository.getProductTagById(tagId, productId);
    }

    @Override
    public ProductTag createProductTag(ProductTag productTag) {
        productTagRepository.saveProductTag(productTag);
        return productTag;
    }

    @Override
    public ProductTag updateProductTag(UUID productId, UUID tagId, ProductTag productTag) {
        if (productTagRepository.getProductTagById(productId, tagId) != null) {
            // return productTagRepository.updateProductTag(productTag);
        }
        return null;
    }

    @Override
    public void deleteProductTag(UUID tagId, UUID productId) {
        // Tìm đối tượng ProductTag dựa trên productId và tagId
        logger.info("tagId :{} và productId: {}", tagId, productId);
        ProductTag productTag = productTagRepository.getProductTagById(tagId, productId);
        logger.info("ProductTag :{} ", productTag);
        // Kiểm tra xem productTag có tồn tại không trước khi xóa
        if (productTag != null) {
            logger.info("Đang xóa ProductTag với productId {} và tagId {}", tagId, productId);
            productTagRepository.deleteProductTag(productTag);
            logger.info("Đã xóa thành công ProductTag với productId {} và tagId {}", productId, tagId);
        } else {
            // Xử lý trường hợp khi không tìm thấy đối tượng ProductTag
            logger.warn("Không tìm thấy ProductTag với productId {} và tagId {} để xóa", productId, tagId);
            // Có thể throw một exception hoặc thực hiện xử lý khác tùy vào yêu cầu của bạn
        }
    }

}
