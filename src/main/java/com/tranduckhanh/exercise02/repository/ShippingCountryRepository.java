package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.ShippingCountry;

public interface ShippingCountryRepository extends JpaRepository<ShippingCountry, String> {

}