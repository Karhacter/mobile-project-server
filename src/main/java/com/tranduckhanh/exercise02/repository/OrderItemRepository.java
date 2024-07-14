package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {

}