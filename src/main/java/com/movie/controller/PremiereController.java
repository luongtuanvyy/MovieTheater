package com.movie.controller;

import com.movie.dao.implement.PremiereDAOImpl;
import com.movie.entity.Movies;
import com.movie.entity.Premiere;
import com.movie.service.PremiereService;
import com.movie.service.implement.PremiereServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = {"/premiere"})
public class PremiereController extends HttpServlet {
    private PremiereService premiereService;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String movieIdStr = request.getParameter("movieId");
        String dateString = request.getParameter("date");

        try {
            Long movieId = Long.parseLong(movieIdStr);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(dateString);

            Movies movies = premiereService.findMovieById(movieId);

            if (movies != null) {
                List<Premiere> premieres = premiereService.findPremieresByMovieAndDate(movies, date);

                request.setAttribute("premieres", premieres);
                request.getRequestDispatcher("/premiere.jsp").forward(request, response);
            } else {
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Movie not found");
            }

        } catch (NumberFormatException | ParseException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid parameters");
        }
    }

    @Override
    public void init() throws ServletException {
        premiereService = new PremiereServiceImpl(new PremiereDAOImpl());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String time = request.getParameter("time");

        List<Premiere> premieres = premiereService.getPremiereTimesByTime(time);
        request.setAttribute("premieres", premieres);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/premiere.jsp");
        dispatcher.forward(request, response);
    }
}


