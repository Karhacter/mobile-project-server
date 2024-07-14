package com.tranduckhanh.exercise02.service;

import java.util.List;
import java.util.UUID;

import com.tranduckhanh.exercise02.entity.Tag;

public interface TagService {

    List<Tag> findTagByProductsProductId(UUID productId);

    List<Tag> getAllTags();

    Tag getTagById(UUID tagId);

    Tag createTag(Tag tag);

    Tag updateTag(UUID tagId, Tag tagDetails);

    void deleteTag(UUID tagId);
}
