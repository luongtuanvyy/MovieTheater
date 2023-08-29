package com.movie.service;
import com.movie.entity.Movie;
import java.util.List;

public interface MovieService {
    Movie findByName(String name);
    List<Movie> findMovieType(String type);
    List <Movie> findAll();

}
