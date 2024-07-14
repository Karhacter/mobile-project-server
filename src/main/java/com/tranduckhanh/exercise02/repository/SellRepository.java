package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Sell;

public interface SellRepository extends JpaRepository<Sell, String> {

}