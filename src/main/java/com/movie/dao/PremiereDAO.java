package com.movie.dao;

import com.movie.entity.Movies;
import com.movie.entity.Premiere;

import java.util.Date;
import java.util.List;

public interface PremiereDAO {
    List<Premiere> findAll();
    Premiere findById(int id);
    Premiere create(Premiere screening);
    Premiere update(Premiere screening);
    void delete(Premiere screening);
    List<Premiere> findPremieresByMovieAndDate(Movies movies, Date date);
    List<Premiere> getPremiereTimesByTime(String time);
}
