package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Integer> {

}