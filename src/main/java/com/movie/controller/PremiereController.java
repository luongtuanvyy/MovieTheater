package com.movie.controller;

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
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/premiere"})
public class PremiereController extends HttpServlet {
    private PremiereService premiereService;

    @Override
    public void init() throws ServletException {
        premiereService = new PremiereServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Premiere> premieres = new ArrayList<>();
        List<Premiere> premieresComingSoon = new ArrayList<>();
        try {
            premieresComingSoon = premiereService.findPremiereIsComingSoon();
            premieres = premiereService.findPremiereOpenThisWeek();
        } catch (Exception e){
            log("Error When call /premiere: ", e);
        }
        req.setAttribute("movies", premieres);
        req.setAttribute("movieIsComingSoon", premieresComingSoon);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user/premiere.jsp");
        requestDispatcher.forward(req, resp);
    }
}
