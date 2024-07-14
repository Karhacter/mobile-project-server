package com.tranduckhanh.exercise02.controller;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tranduckhanh.exercise02.entity.Gallery;
import com.tranduckhanh.exercise02.service.GalleryService;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
@RestController
@AllArgsConstructor
@RequestMapping("api/galleries")
public class GalleryController {

    @Autowired
    private GalleryService galleryService;

    // Get All Galleries REST API
    // http://localhost:8080/api/galleries
    @GetMapping
    public ResponseEntity<List<Gallery>> getAllGalleries() {
        List<Gallery> galleries = galleryService.getAllGalleries();
        return new ResponseEntity<>(galleries, HttpStatus.OK);
    }

    // Get Gallery by id REST API
    // http://localhost:8080/api/galleries/{id}

    @GetMapping("{id}")
    public ResponseEntity<Gallery> getGalleryById(@PathVariable("id") UUID id) {
        Gallery gallery = galleryService.getGalleryById(id);
        if (gallery != null) {
            return new ResponseEntity<>(gallery, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create Gallery REST API
    @PostMapping
    public ResponseEntity<Gallery> createGallery(@RequestBody Gallery gallery) {
        Gallery savedGallery = galleryService.createGallery(gallery);
        return new ResponseEntity<>(savedGallery, HttpStatus.CREATED);
    }

    // Update Gallery REST API
    @PutMapping("{id}")
    public ResponseEntity<Gallery> updateGallery(@PathVariable("id") UUID id,
            @RequestBody Gallery gallery) {
        Gallery updatedGallery = galleryService.updateGallery(id, gallery);
        if (updatedGallery != null) {
            return new ResponseEntity<>(updatedGallery, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete Gallery REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGallery(@PathVariable("id") UUID id) {
        galleryService.deleteGallery(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
