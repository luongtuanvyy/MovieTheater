package com.movie.service.implement;

import com.movie.dao.MovieDAO;
import com.movie.dao.implement.MovieDAOImplement;
import com.movie.entity.Movie;
import com.movie.service.MovieService;

import java.util.List;

public class MovieServiceImplement implements MovieService {
    private MovieDAO movieDAO;
    public MovieServiceImplement() {
        movieDAO = new MovieDAOImplement();
    }
    @Override
    public Movie findByTitle(String title) {
        return movieDAO.findByTitle(title);
    }

    @Override
    public List<Movie> findMovieType(String type) {
        return movieDAO.findMovieType(type);
    }

    @Override
    public List<Movie> findAll() {
        return movieDAO.findAll();
    }
}
