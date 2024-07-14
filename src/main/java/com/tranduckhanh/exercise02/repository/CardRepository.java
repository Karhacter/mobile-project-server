package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Card;

public interface CardRepository extends JpaRepository<Card, String> {

}
