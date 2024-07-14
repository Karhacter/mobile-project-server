package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Attribute;

public interface AttributeRepository extends JpaRepository<Attribute, String> {

}