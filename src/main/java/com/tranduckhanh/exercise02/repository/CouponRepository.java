package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, String> {

}