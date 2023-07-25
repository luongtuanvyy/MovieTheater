package com.movie.controller;

import com.movie.service.UserService;
import com.movie.service.implement.UserServiceImplement;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/hi"})
public class HelloServlet extends HttpServlet {


    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserServiceImplement();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/admin/home.jsp");

        userService.getUsers().forEach(user -> {
            System.out.println(user.getEmail());
            System.out.println(user.getPassword());
        });
        System.out.println(userService==null?"null":"khong null");

        requestDispatcher.forward(request, response);
    }

}