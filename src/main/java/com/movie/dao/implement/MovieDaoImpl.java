package com.movie.dao.implement;

import com.movie.dao.AbtractDAO;
import com.movie.dao.MovieDao;
import com.movie.entity.Movie;

import java.util.List;

public class MovieDaoImpl extends AbtractDAO<Movie> implements MovieDao {
    @Override
    public List<Movie> getAllMovie() {
        List<Movie> result = super.findAll(Movie.class, true);
        return result;
    }

    @Override
    public Movie addMovie(Movie movie) {
        Movie result = super.create(movie);
        return result;
    }

    @Override
    public Movie updateMovie(Movie movie) {
        Movie result = super.update(movie);
        return result;
    }

    @Override
    public void deleteMovie(Movie movie) {
        super.delete(movie);
    }
}
