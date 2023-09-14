package com.movie.dao.implement;

import com.movie.dao.AbstractDao;
import com.movie.dao.PremiereDAO;
import com.movie.entity.Movies;
import com.movie.entity.Premiere;

import java.util.Date;
import java.util.List;

public class PremiereDAOImpl extends AbstractDao<Premiere> implements PremiereDAO {
    public PremiereDAOImpl() {
    }

    @Override
    public Premiere findById(int id) {
        return super.findByID(Premiere.class, id);
    }

    @Override
    public Premiere create(Premiere screening) {
        return super.create(screening);
    }

    @Override
    public Premiere update(Premiere screening) {
        return super.update(screening);
    }

    @Override
    public void delete(Premiere screening) {
        super.delete(screening);
    }

    @Override
    public List<Premiere> findAll() {
        return super.findAll(Premiere.class);
    }

    @Override
    public List<Premiere> findPremieresByMovieAndDate(Movies movies, Date date) { return super.findPremieresByMovieAndDate(movies,date);}

    @Override
    public List<Premiere> getPremiereTimesByTime(String time) {return super.getPremiereTimesByTime();
    }
}