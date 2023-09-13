package com.movie.dao.implement;

import com.movie.dao.AbstractDAO;
import com.movie.dao.MovieDAO;
import com.movie.entity.Movies;

import java.util.List;

public class MovieDAOImplement extends AbstractDAO <Movies> implements MovieDAO {

    @Override
    public List<Movies> findByName(String name) {
        String sql = "SELECT o FROM Movies o WHERE o.name LIKE ?0";
        name = name + "%";
        return super.findByParams(Movies.class,sql, name);
    }
    @Override
    public List<Movies> findMovieType(String type) {
        String sql = " FROM Movie WHERE type = ?0";
        return super.findMany(Movies.class,sql, type);
    }
    @Override
    public List<Movies> findAll() {
        return super.findAll(Movies.class);
    }

    @Override
    public Movies create(Movies entity) {
        return super.create(entity);
    }

    @Override
    public Movies update(Movies entity) {
        return super.update(entity);
    }
    @Override
    public void delete(Movies entity) {
        super.delete(entity);
    }
}
