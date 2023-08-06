package com.movie.controller;

import com.movie.entity.Screening;
import com.movie.service.ScreeningService;
import com.movie.service.implement.ScreeningServiceImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/hi"})
public class HelloServlet extends HttpServlet {

    private ScreeningService screeningService;

    @Override
    public void init() throws ServletException {
        screeningService = new ScreeningServiceImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Screening> listScreening = new ArrayList<>();
        List<Screening> listScreeningIsComingSoon = new ArrayList<>();
        try {
            listScreeningIsComingSoon = screeningService.findScreeningIsComingSoon();
            listScreening = screeningService.findScreeningOpen();
            request.setAttribute("movies", listScreening);
            request.setAttribute("movieIsComingSoon", listScreeningIsComingSoon);
        } catch (Exception e){
            log("Error: ", e);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/user/demo.jsp");
        requestDispatcher.forward(request, response);
    }

}