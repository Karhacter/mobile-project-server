package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.VariantValue;

public interface VariantValueRepository extends JpaRepository<VariantValue, String> {

}