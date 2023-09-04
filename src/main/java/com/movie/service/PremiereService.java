package com.movie.service;

import com.movie.entity.Movie;
import com.movie.entity.Premiere;

import java.util.Date;
import java.util.List;

public interface PremiereService {
    List<Premiere> findPremiereOpenThisWeek();
    List<Premiere> findPremiereIsComingSoon();
    List<Premiere> findAll();
    List<Premiere> findPremieresByMovieAndDate(Movie movie, Date date);
    Movie findMovieById(Long movieId);
    List<Premiere> getPremiereTimesByTime(String time);
}
