package com.movie.dao.implement;

import com.movie.dao.AbtractDAO;
import com.movie.dao.PremiereDAO;
import com.movie.entity.Premiere;

import java.util.List;

public class PremiereDAOIpml extends AbtractDAO<Premiere> implements PremiereDAO {
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
        return super.findAll(Premiere.class, true);
    }
}
