package com.tranduckhanh.exercise02.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.io.IOUtils;;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/images")
public class ImageController {
    @GetMapping("/{id}")
    @CacheEvict(value = "first", allEntries = true)
    public @ResponseBody byte[] getImage(@PathVariable("id") String id) throws IOException {
        InputStream in = getClass().getResourceAsStream("/static/" + id);
        return IOUtils.toByteArray(in);
    }
}
