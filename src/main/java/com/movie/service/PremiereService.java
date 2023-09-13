package com.movie.service;

import com.movie.entity.Movies;
import com.movie.entity.Premiere;

import java.util.Date;
import java.util.List;

public interface PremiereService {
    List<Premiere> findPremiereOpenThisWeek();
    List<Premiere> findPremiereIsComingSoon();
    List<Premiere> findAll();
    List<Premiere> findPremieresByMovieAndDate(Movies movies, Date date);
    Movies findMovieById(Long movieId);
    List<Premiere> getPremiereTimesByTime(String time);
}
