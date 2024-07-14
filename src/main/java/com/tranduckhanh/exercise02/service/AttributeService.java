package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Attribute;

public interface AttributeService {
    Attribute createAttribute(Attribute attribute);

    Attribute getAttributeById(String attributeId);

    List<Attribute> getAllAttributes();

    Attribute updateAttribute(Attribute attribute);

    void deleteAttribute(String attributeId);
}