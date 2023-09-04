package com.movie.service;

import com.movie.entity.Corn;
import com.movie.entity.Water;

import java.util.List;

public interface ServicesService {
    List<Corn> getAllCorns();
    List<Water> getAllWaters();
}
