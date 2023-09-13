package com.movie.TestDAO;

import com.movie.entity.Movies;
import com.movie.service.MovieService;
import com.movie.service.implement.MovieServiceImplement;

import java.util.List;

public class test {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImplement();
        List<Movies> movies = movieService.findByName("G");
        System.out.println(movies.size());
    }
}
