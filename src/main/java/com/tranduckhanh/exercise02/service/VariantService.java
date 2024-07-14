package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Variant;

public interface VariantService {
    Variant createVariant(Variant variant);

    Variant getVariantById(String variantId);

    List<Variant> getAllVariants();

    Variant updateVariant(Variant variant);

    void deleteVariant(String variantId);
}