package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Notification;

public interface NotificationService {
    Notification createNotification(Notification notification);

    Notification getNotificationById(String notificationId);

    List<Notification> getAllNotifications();

    Notification updateNotification(Notification notification);

    void deleteNotification(String notificationId);
}