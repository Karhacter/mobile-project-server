package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Sell;

public interface SellService {
    Sell createSell(Sell sell);

    Sell getSellById(String sellId);

    List<Sell> getAllSells();

    Sell updateSell(Sell sell);

    void deleteSell(String sellId);
}