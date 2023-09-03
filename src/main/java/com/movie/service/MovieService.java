package com.movie.service;

import com.movie.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovie();

    Movie addMovie(Movie movie);

    Movie updateMovie(Movie movie);

    void deleteMovie(Movie movie);
}
