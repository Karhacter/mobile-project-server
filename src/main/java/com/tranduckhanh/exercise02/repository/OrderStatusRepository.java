package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, String> {

}