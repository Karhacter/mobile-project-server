package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.StaffAccount;

public interface StaffAccountService {
    StaffAccount createStaffAccount(StaffAccount staffAccount);

    StaffAccount getStaffAccountById(String staffAccountId);

    List<StaffAccount> getAllStaffAccounts();

    StaffAccount updateStaffAccount(StaffAccount staffAccount);

    void deleteStaffAccount(String staffAccountId);
}