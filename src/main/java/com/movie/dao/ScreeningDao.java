package com.movie.dao;

import com.movie.entity.Screening;

import java.util.List;

public interface ScreeningDao {
    List<Screening> findAll();
    Screening findById(int id);
    Screening create(Screening screening);
    Screening update(Screening screening);
    void delete(Screening screening);
}
