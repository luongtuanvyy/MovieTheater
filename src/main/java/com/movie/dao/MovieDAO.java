package com.movie.dao;
import com.movie.entity.Movies;

import java.util.List;

public interface MovieDAO {
    List<Movies> findByName(String name);
    List<Movies> findMovieType(String type);
    List <Movies> findAll();
    Movies create (Movies entity);
    Movies update (Movies entity);
    void delete (Movies entity);
}
