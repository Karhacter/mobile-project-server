package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Shipping;

public interface ShippingService {
    Shipping createShipping(Shipping shipping);

    Shipping getShippingById(Integer shippingId);

    List<Shipping> getAllShippings();

    Shipping updateShipping(Shipping shipping);

    void deleteShipping(Integer shippingId);
}