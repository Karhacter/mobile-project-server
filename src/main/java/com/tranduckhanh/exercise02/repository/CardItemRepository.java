package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.CardItem;

public interface CardItemRepository extends JpaRepository<CardItem, String> {

}
