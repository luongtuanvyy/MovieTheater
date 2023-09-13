package com.movie.service.implement;

import com.movie.dao.PremiereDAO;
import com.movie.dao.implement.PremiereDAOImpl;
import com.movie.entity.Movies;
import com.movie.entity.Premiere;
import com.movie.service.PremiereService;

import javax.persistence.Query;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.movie.dao.AbstractDAO.entityManager;

public class PremiereServiceImpl implements PremiereService {
    PremiereDAO premiereDAO;
    public PremiereServiceImpl(PremiereDAOImpl premiereDAO){
        this.premiereDAO = new PremiereDAOImpl();
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
    public List<Premiere> findAll() {
        return null;
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
    public List<Premiere> findPremieresByMovieAndDate(Movies movies, Date date) {
        Query query = entityManager.createQuery("SELECT p FROM Premiere p WHERE p.movie = :movie AND p.time = :date", Premiere.class);
        query.setParameter("movie", movies);
        query.setParameter("date", date);
        return query.getResultList();
    }

    @Override
    public Movies findMovieById(Long movieId) {
        return null;
    }

    @Override
    public List<Premiere> getPremiereTimesByTime(String time) {
        return premiereDAO.getPremiereTimesByTime(time);
    }
}
