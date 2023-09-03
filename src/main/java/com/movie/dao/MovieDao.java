package com.movie.dao;

import com.movie.entity.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> getAllMovie();

    Movie addMovie(Movie movie);

    Movie updateMovie(Movie movie);

    void deleteMovie(Movie movie);
}
