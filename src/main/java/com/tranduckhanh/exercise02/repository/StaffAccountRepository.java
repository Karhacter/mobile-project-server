package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.StaffAccount;

public interface StaffAccountRepository extends JpaRepository<StaffAccount, String> {

}