package com.movie.service.implement;

import com.movie.dao.ScreeningDao;
import com.movie.dao.implement.ScreeningDaoImpl;
import com.movie.entity.Screening;
import com.movie.service.ScreeningService;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class ScreeningServiceImpl implements ScreeningService {
    ScreeningDao screeningDao;
    public ScreeningServiceImpl(){
        screeningDao = new ScreeningDaoImpl();
    }
    @Override
    public List<Screening> findScreeningOpen() {
        Calendar calendarNow = Calendar.getInstance();
        Calendar calendarNextWeek = Calendar.getInstance();
        calendarNextWeek.add(Calendar.DATE, 7);
        List<Screening> listScreening = screeningDao.findAll().stream()
                .filter(element -> element.getScreeningStart().before(calendarNow.getTime()))
                .filter(element -> element.getScreeningStart().after(calendarNextWeek.getTime()))
                .collect(Collectors.toList());
        return listScreening;
    }

    @Override
    public List<Screening> findAll() {
        return screeningDao.findAll();
    }
}
