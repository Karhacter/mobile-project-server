package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.CardItem;

public interface CardItemService {
    CardItem createCardItem(CardItem cardItem);

    CardItem getCardItemById(String cardItemId);

    List<CardItem> getAllCardItems();

    CardItem updateCardItem(CardItem cardItem);

    void deleteCardItem(String cardItemId);
}