package com.movie.dao;
import com.movie.entity.Movie;
import java.util.List;

public interface MovieDAO {
    Movie findByName(String name);
    List<Movie> findMovieType(String type);
    List <Movie> findAll();
    Movie create (Movie entity);
    Movie update (Movie entity);
    void delete (Movie entity);
}
