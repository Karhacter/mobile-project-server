package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.ProductSupply;

public interface ProductSupplyRepository extends JpaRepository<ProductSupply, String> {

}