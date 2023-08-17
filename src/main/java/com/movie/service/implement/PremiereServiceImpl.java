package com.movie.service.implement;

import com.movie.dao.PremiereDAO;
import com.movie.dao.implement.PremiereDAOIpml;
import com.movie.entity.Premiere;
import com.movie.service.PremiereService;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class PremiereServiceImpl implements PremiereService {
    PremiereDAO premiereDAO;
    public PremiereServiceImpl(){
        premiereDAO = new PremiereDAOIpml();
    }
    @Override
    public List<Premiere> findPremiereIsComingSoon() {
        Calendar calendarNow = Calendar.getInstance();
        Calendar calendarNextWeek = Calendar.getInstance();
        calendarNextWeek.add(Calendar.DATE, 7);
        List<Premiere> listPremiere = premiereDAO.findAll().stream()
                .filter(element -> element.getTime().after(calendarNow.getTime()))
                .filter(element -> element.getTime().before(calendarNextWeek.getTime()))
                .collect(Collectors.toList());
        return listPremiere;
    }

    @Override
    public List<Premiere> findPremiereOpen() {
        Calendar calendarNow = Calendar.getInstance();
        List<Premiere> listPremiere = premiereDAO.findAll().stream()
                .filter(element -> element.getTime().equals(calendarNow.getTime()))
                .collect(Collectors.toList());
        return listPremiere;
    }

    @Override
    public List<Premiere> findAll() {
        return premiereDAO.findAll();
    }
}
