package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}