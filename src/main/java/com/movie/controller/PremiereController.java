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

@WebServlet(urlPatterns = {"/movieOpen", "/movieIsComing"})
public class PremiereController extends HttpServlet {
    private PremiereService premiereService;

    @Override
    public void init() throws ServletException {
        premiereService = new PremiereServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getUrlPattern = req.getServletPath();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        switch (getUrlPattern){
            case "/movieOpen":
                findMovieOpen(req, resp);
                System.out.println("AAAAAAAAAAAAAAAAAAAAA");
                break;
            case "/movieIsComing":
                findMovieIsComing(req, resp);
                break;
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user/home.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void findMovieOpen (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Premiere> premiereList = new ArrayList<>();
        try {
            premiereList = premiereService.findPremiereOpen();
            req.setAttribute("movies", premiereList);
        } catch (Exception e){
            log("Failed when call /movieOpen: ", e);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user/premiere.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void findMovieIsComing(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Premiere> premiereList = new ArrayList<>();
        try {
            premiereList = premiereService.findPremiereIsComingSoon();
            req.setAttribute("movies", premiereList);
        } catch (Exception e){
            log("Failed when call /movieIsComing; ", e);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user/premiere.jsp");
        requestDispatcher.forward(req, resp);
    }
}
