package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.AttributeValue;

public interface AttributeValueService {
    AttributeValue createAttributeValue(AttributeValue attributeValue);

    AttributeValue getAttributeValueById(String attributeValueId);

    List<AttributeValue> getAllAttributeValues();

    AttributeValue updateAttributeValue(AttributeValue attributeValue);

    void deleteAttributeValue(String attributeValueId);
}