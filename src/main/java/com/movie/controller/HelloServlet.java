package com.movie.controller;

import com.movie.entity.Movie;
import com.movie.entity.Screening;
import com.movie.entity.User;
import com.movie.service.ScreeningService;
import com.movie.service.UserService;
import com.movie.service.implement.ScreeningServiceImpl;
import com.movie.service.implement.UserServiceImplement;

import java.io.*;
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
        List<Screening> listScreening = screeningService.findAll();
        request.setAttribute("movies", listScreening);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/user/demo.jsp");
        requestDispatcher.forward(request, response);
    }

}