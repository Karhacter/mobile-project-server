package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.ProductShippingInfo;

public interface ProductShippingInfoRepository extends JpaRepository<ProductShippingInfo, String> {

}