package com.aop.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

    public String getMovieDetails(){
        return "Sherlock holmes";
    }
}
