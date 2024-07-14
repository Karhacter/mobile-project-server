package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.ShippingRate;

public interface ShippingRateService {
    ShippingRate createShippingRate(ShippingRate shippingRate);

    ShippingRate getShippingRateById(String shippingRateId);

    List<ShippingRate> getAllShippingRates();

    ShippingRate updateShippingRate(ShippingRate shippingRate);

    void deleteShippingRate(String shippingRateId);
}