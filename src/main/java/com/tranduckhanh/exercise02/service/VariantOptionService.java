package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.VariantOption;

public interface VariantOptionService {
    VariantOption createVariantOption(VariantOption variantOption);

    VariantOption getVariantOptionById(String variantOptionId);

    List<VariantOption> getAllVariantOptions();

    VariantOption updateVariantOption(VariantOption variantOption);

    void deleteVariantOption(String variantOptionId);
}