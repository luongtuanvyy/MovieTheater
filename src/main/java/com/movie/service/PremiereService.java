package com.movie.service;

import com.movie.entity.Premiere;

import java.util.List;

public interface PremiereService {
    List<Premiere> findPremiereOpenThisWeek();
    List<Premiere> findPremiereIsComingSoon();
    List<Premiere> findAll();
}
