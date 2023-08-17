package com.movie.service;

import com.movie.entity.Premiere;

import java.util.List;

public interface PremiereService {
    List<Premiere> findPremiereOpen();
    List<Premiere> findPremiereIsComingSoon();
    List<Premiere> findAll();
}
