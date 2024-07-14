package com.tranduckhanh.exercise02.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.tranduckhanh.exercise02.entity.ProductCoupon;
import com.tranduckhanh.exercise02.repository.ProductCouponRepository;
import com.tranduckhanh.exercise02.service.ProductCouponService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductCouponServiceImpl implements ProductCouponService {
    private ProductCouponRepository productCouponRepository;

    @Override
    public ProductCoupon createProductCoupon(ProductCoupon productCoupon) {
        return productCouponRepository.save(productCoupon);
    }

    @Override
    public ProductCoupon getProductCouponById(String productCouponId) {
        Optional<ProductCoupon> optionalProductCoupon = productCouponRepository.findById(productCouponId);
        return optionalProductCoupon.orElse(null);
    }

    @Override
    public List<ProductCoupon> getAllProductCoupons() {
        return productCouponRepository.findAll();
    }

    @Override
    public ProductCoupon updateProductCoupon(ProductCoupon productCoupon) {
        Optional<ProductCoupon> optionalExistingProductCoupon = productCouponRepository
                .findById(productCoupon.getProductCouponId());
        if (optionalExistingProductCoupon.isPresent()) {
            ProductCoupon existingProductCoupon = optionalExistingProductCoupon.get();
            existingProductCoupon.setProduct(productCoupon.getProduct());
            existingProductCoupon.setCoupon(productCoupon.getCoupon());

            ProductCoupon updatedProductCoupon = productCouponRepository.save(existingProductCoupon);
            return updatedProductCoupon;
        }

        return null;
    }

    @Override
    public void deleteProductCoupon(String productCouponId) {
        productCouponRepository.deleteById(productCouponId);
    }
}
