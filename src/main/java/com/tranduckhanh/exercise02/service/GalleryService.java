package com.tranduckhanh.exercise02.service;

import java.util.List;
import java.util.UUID;

import com.tranduckhanh.exercise02.entity.Gallery;

public interface GalleryService {

    List<Gallery> getAllGalleries();

    Gallery getGalleryById(UUID galleryId);

    Gallery createGallery(Gallery gallery);

    Gallery updateGallery(UUID id, Gallery gallery);

    void deleteGallery(UUID id);
}
