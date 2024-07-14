package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.AttributeValue;

public interface AttributeValueRepository extends JpaRepository<AttributeValue, String> {

}