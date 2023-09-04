package com.movie.service.implement;

import com.movie.dao.ServicesDAO;
import com.movie.entity.Corn;
import com.movie.entity.Water;
import com.movie.service.ServicesService;

import java.util.List;

public class ServicesServiceImpl implements ServicesService {

    private ServicesDAO servicesDAO;

    public ServicesServiceImpl(ServicesDAO servicesDAO) {
        this.servicesDAO = servicesDAO;
    }

    @Override
    public List<Corn> getAllCorns() {
        return servicesDAO.getAllCorns();
    }

    @Override
    public List<Water> getAllWaters() {
        return servicesDAO.getAllWaters();
    }
}
