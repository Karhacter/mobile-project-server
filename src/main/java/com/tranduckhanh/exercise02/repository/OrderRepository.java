package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

}