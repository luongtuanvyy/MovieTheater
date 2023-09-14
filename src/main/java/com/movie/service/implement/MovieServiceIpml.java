package com.movie.service.implement;

import com.movie.dao.MovieDao;
import com.movie.dao.implement.MovieDaoImpl;
import com.movie.entity.Movie;
import com.movie.service.MovieService;

import java.util.List;

public class MovieServiceIpml implements MovieService {
    MovieDao movieDao;

    public MovieServiceIpml() {
        this.movieDao = new MovieDaoImpl();
    }

    @Override
    public List<Movie> getAllMovie() {
        List<Movie> resutl = this.movieDao.getAllMovie();
        return resutl;
    }

    @Override
    public Movie addMovie(Movie movie) {
        Movie result = this.movieDao.addMovie(movie);
        return result;
    }

    @Override
    public Movie updateMovie(Movie movie) {
        Movie result = this.movieDao.updateMovie(movie);
        return result;
    }

    @Override
    public void deleteMovie(Movie movie) {
        this.movieDao.deleteMovie(movie);
    }

    @Override
    public Movie getMovieById(String id) {
        Movie result = this.movieDao.getMovieById(id);
        return result;
    }
}
