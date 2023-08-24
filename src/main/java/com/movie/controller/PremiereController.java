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
        List<Premiere> premiereList = new ArrayList<>();
        List<Premiere> premiereListComingSoon = new ArrayList<>();
        try {
            premiereListComingSoon = premiereService.findPremiereIsComingSoon();
            premiereList = premiereService.findPremiereOpenThisWeek();
            req.setAttribute("movies", premiereList);
            req.setAttribute("movieIsComingSoon", premiereListComingSoon);
        } catch (Exception e){
            log("Error: ", e);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user/premiere.jsp");
        requestDispatcher.forward(req, resp);
    }
}
