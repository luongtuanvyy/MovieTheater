package com.movie.dao.implement;

import com.movie.dao.AbtractDAO;
import com.movie.dao.ScreeningDao;
import com.movie.entity.Screening;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ScreeningDaoImpl extends AbtractDAO<Screening> implements ScreeningDao {

    @Override
    public Screening findById(int id) {
        return super.findByID(Screening.class, id);
    }

    @Override
    public Screening create(Screening screening) {
        return super.create(screening);
    }

    @Override
    public Screening update(Screening screening) {
        return super.update(screening);
    }

    @Override
    public void delete(Screening screening) {
        super.delete(screening);
    }

    @Override
    public List<Screening> findAll() {
        return super.findAll(Screening.class);
    }
}
