package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, String> {

}