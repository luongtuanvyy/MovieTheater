package com.movie.dao.implement;

import com.movie.dao.AbstractDAO;
import com.movie.dao.MovieDAO;
import com.movie.entity.Movie;

import java.util.List;

public class MovieDAOImplement extends AbstractDAO <Movie> implements MovieDAO {

    @Override
    public Movie findByName(String name) {
        String sql = " FROM Movie WHERE name = ?0";
        return super.findOne(Movie.class,sql, name);
    }
    @Override
    public List<Movie> findMovieType(String type) {
        String sql = " FROM Movie WHERE type = ?0";
        return super.findMany(Movie.class,sql, type);
    }
    @Override
    public List<Movie> findAll() {
        return super.findAll(Movie.class);
    }

    @Override
    public Movie create(Movie entity) {
        return super.create(entity);
    }

    @Override
    public Movie update(Movie entity) {
        return super.update(entity);
    }
    @Override
    public void delete(Movie entity) {
        super.delete(entity);
    }
}
