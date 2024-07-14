package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Coupon;

public interface CouponService {
    Coupon createCoupon(Coupon coupon);

    Coupon getCouponById(String couponId);

    List<Coupon> getAllCoupons();

    Coupon updateCoupon(Coupon coupon);

    void deleteCoupon(String couponId);
}