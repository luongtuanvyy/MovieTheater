package com.movie.dao;

import com.movie.entity.Corn;
import com.movie.entity.Water;

import java.util.List;

public interface ServicesDAO {
    List<Corn> getAllCorns();
    List<Water> getAllWaters();
}
