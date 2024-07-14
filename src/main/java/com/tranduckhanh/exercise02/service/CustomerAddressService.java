package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.CustomerAddress;

public interface CustomerAddressService {
    CustomerAddress createCustomerAddress(CustomerAddress customerAddress);

    CustomerAddress getCustomerAddressById(String customerAddressId);

    List<CustomerAddress> getAllCustomerAddresses();

    CustomerAddress updateCustomerAddress(CustomerAddress customerAddress);

    void deleteCustomerAddress(String customerAddressId);
}