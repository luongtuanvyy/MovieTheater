package com.movie.controller;

import com.movie.entity.User;
import com.movie.service.UserService;
import com.movie.service.implement.UserServiceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/editProfile")
public class UserController extends HttpServlet {

    private UserService userService = new UserServiceImplement();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        User user = userService.getUserById(userId);
        request.setAttribute("user", user);
        request.getRequestDispatcher("/demoMovies.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        User updatedUser = userService.updateUserInfo(userId, firstName, lastName, email, phone);
        request.setAttribute("user", updatedUser);
        request.setAttribute("message", "Thông tin đã được cập nhật.");
        request.getRequestDispatcher("/demoMovies.jsp").forward(request, response);
    }
}

