package com.tranduckhanh.exercise02.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.tranduckhanh.exercise02.entity.Order;
import com.tranduckhanh.exercise02.repository.OrderRepository;
import com.tranduckhanh.exercise02.service.OrderService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(String orderId) {
        Optional<Order> optionalOrder = orderRepository.findById(orderId);
        return optionalOrder.orElse(null);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Order order) {
        Optional<Order> optionalExistingOrder = orderRepository.findById(order.getOrderId());
        if (optionalExistingOrder.isPresent()) {
            Order existingOrder = optionalExistingOrder.get();
            existingOrder.setCoupon(order.getCoupon());
            existingOrder.setCustomer(order.getCustomer());
            existingOrder.setOrderStatus(order.getOrderStatus());
            existingOrder.setOrderApprovedAt(LocalDateTime.now());
            existingOrder.setOrderDeliveredCarrierDate(LocalDateTime.now());
            existingOrder.setOrderDeliveredCustomerDate(LocalDateTime.now());

            Order updatedOrder = orderRepository.save(existingOrder);
            return updatedOrder;
        }

        return null;
    }

    @Override
    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }
}
