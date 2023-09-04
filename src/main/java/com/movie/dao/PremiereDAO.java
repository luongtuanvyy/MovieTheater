package com.movie.dao;

import com.movie.entity.Movie;
import com.movie.entity.Premiere;

import java.util.Date;
import java.util.List;

public interface PremiereDAO {
    List<Premiere> findAll();
    Premiere findById(int id);
    Premiere create(Premiere screening);
    Premiere update(Premiere screening);
    void delete(Premiere screening);
    List<Premiere> findPremieresByMovieAndDate(Movie movie, Date date);
    List<Premiere> getPremiereTimesByTime(String time);
}
