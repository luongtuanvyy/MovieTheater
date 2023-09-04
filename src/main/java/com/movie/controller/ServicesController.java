package com.movie.controller;

import com.movie.dao.ServicesDAO;
import com.movie.dao.implement.ServicesDAOImpl;
import com.movie.entity.Corn;
import com.movie.entity.Water;
import com.movie.service.ServicesService;
import com.movie.service.implement.ServicesServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/services")
public class ServicesController extends HttpServlet {

    private ServicesService servicesService;

    @Override
    public void init() throws ServletException {
        super.init();
        ServicesDAO servicesDAO = new ServicesDAOImpl();
        servicesService = new ServicesServiceImpl(servicesDAO);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        List<Corn> corns = servicesService.getAllCorns();
        List<Water> waters = servicesService.getAllWaters();

        request.setAttribute("corns", corns);
        request.setAttribute("waters", waters);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/services.jsp");
        dispatcher.forward(request, response);
    }
}

