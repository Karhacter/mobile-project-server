package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.SlideShow;

public interface SlideShowService {
    SlideShow createSlideShow(SlideShow slideShow);

    SlideShow getSlideShowById(String SlideShowId);

    List<SlideShow> getAllSlideShows();

    SlideShow updateSlideShow(SlideShow slideShow);

    void deleteSlideShow(String SlideShowId);
}