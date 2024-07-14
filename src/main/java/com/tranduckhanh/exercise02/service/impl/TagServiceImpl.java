package com.tranduckhanh.exercise02.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranduckhanh.exercise02.entity.Tag;
import com.tranduckhanh.exercise02.repository.TagRepository;
import com.tranduckhanh.exercise02.service.TagService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    @Override
    public Tag getTagById(UUID tagId) {
        Optional<Tag> optionalTag = tagRepository.findById(tagId);
        return optionalTag.orElse(null);
    }

    @Override
    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public Tag updateTag(UUID tagId, Tag tagDetails) {
        Optional<Tag> optionalTag = tagRepository.findById(tagId);
        if (optionalTag.isPresent()) {
            Tag existingTag = optionalTag.get();
            // Update properties of existingTag with tagDetails
            return tagRepository.save(existingTag);
        }
        return null; // Or throw exception indicating not found
    }

    @Override
    public void deleteTag(UUID tagId) {
        tagRepository.deleteById(tagId);
    }

    @Override
    public List<Tag> findTagByProductsProductId(UUID productId) {
        // TODO Auto-generated method stub
        List<Tag> tags = tagRepository.findTagByProductsProductId(productId);
        return tags;
    }
}
