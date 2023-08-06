package com.movie.service;

import com.movie.entity.Screening;

import java.util.List;

public interface ScreeningService {
    List<Screening> findScreeningOpen();
    List<Screening> findAll();
}
