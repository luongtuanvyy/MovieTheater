package com.movie.service;
import com.movie.entity.Movies;

import java.util.List;

public interface MovieService {
    List<Movies> findByName(String name);
    List<Movies> findMovieType(String type);
    List <Movies> findAll();

}
