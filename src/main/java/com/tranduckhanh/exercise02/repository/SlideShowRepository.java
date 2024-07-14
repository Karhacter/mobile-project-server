package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.SlideShow;

public interface SlideShowRepository extends JpaRepository<SlideShow, String> {

}