package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.ProductCoupon;

public interface ProductCouponService {
    ProductCoupon createProductCoupon(ProductCoupon productCoupon);

    ProductCoupon getProductCouponById(String productCouponId);

    List<ProductCoupon> getAllProductCoupons();

    ProductCoupon updateProductCoupon(ProductCoupon productCoupon);

    void deleteProductCoupon(String productCouponId);
}