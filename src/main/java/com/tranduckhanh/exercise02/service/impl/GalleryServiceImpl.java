package com.tranduckhanh.exercise02.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranduckhanh.exercise02.entity.Gallery;
import com.tranduckhanh.exercise02.repository.GalleryRepository;
import com.tranduckhanh.exercise02.service.GalleryService;

import java.util.List;
import java.util.UUID;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Autowired
    private GalleryRepository galleryRepository;

    @Override
    public List<Gallery> getAllGalleries() {
        return galleryRepository.findAll();
    }

    public Gallery getGalleryById(UUID id) {
        return galleryRepository.findById(id).orElse(null);
    }

    @Override
    public Gallery createGallery(Gallery gallery) {
        return galleryRepository.save(gallery);
    }

    @Override
    public Gallery updateGallery(UUID id, Gallery gallery) {
        if (!galleryRepository.existsById(id)) {
            return null; // or throw an exception
        }
        gallery.setGalleryId(id);
        return galleryRepository.save(gallery);
    }

    @Override
    public void deleteGallery(UUID id) {
        galleryRepository.deleteById(id);
    }
}
