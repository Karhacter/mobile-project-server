package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.VariantValue;

public interface VariantValueService {
    VariantValue createVariantValue(VariantValue variantValue);

    VariantValue getVariantValueById(String variantValueId);

    List<VariantValue> getAllVariantValues();

    VariantValue updateVariantValue(VariantValue variantValue);

    void deleteVariantValue(String variantValueId);
}