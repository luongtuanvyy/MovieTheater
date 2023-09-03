package com.movie.service.implement;

import com.movie.dao.PremiereDAO;
import com.movie.dao.implement.PremiereDAOIpml;
import com.movie.entity.Premiere;
import com.movie.service.PremiereService;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
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
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endOfWeek = now.with(LocalTime.MAX).with(java.time.DayOfWeek.SUNDAY);
        List<Premiere> premieres = premiereDAO.findAll().stream()
                .filter(element -> {
                    LocalDateTime premiereTime = element.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                    return premiereTime.isAfter(endOfWeek);
                })
                .collect(Collectors.toList());
        return premieres;
    }

    @Override
    public List<Premiere> findPremiereOpenThisWeek() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endOfWeek = now.with(LocalTime.MAX).with(java.time.DayOfWeek.SUNDAY);

        List<Premiere> premieres = premiereDAO.findAll().stream()
                .filter(element -> {
                    LocalDateTime premiereTime = element.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                    return premiereTime.isAfter(now) && premiereTime.isBefore(endOfWeek);
                })
                .collect(Collectors.toList());

        return premieres;
    }

    @Override
    public List<Premiere> findAll() {
        return premiereDAO.findAll();
    }
}
