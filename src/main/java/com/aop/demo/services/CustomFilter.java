package com.aop.demo.services;

import com.aop.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomFilter {

    @Autowired
    private MovieRepository movieRepository;

    public String applyFilter() throws InterruptedException {
        Thread.sleep(1000);
        return movieRepository.getMovieDetails();
    }
}
