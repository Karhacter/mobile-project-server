package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.OrderItem;

public interface OrderItemService {
    OrderItem createOrderItem(OrderItem orderItem);

    OrderItem getOrderItemById(String orderItemId);

    List<OrderItem> getAllOrderItems();

    OrderItem updateOrderItem(OrderItem orderItem);

    void deleteOrderItem(String orderItemId);
}