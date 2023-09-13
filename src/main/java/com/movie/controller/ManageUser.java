package com.movie.controller;

import com.movie.entity.User;
import com.movie.model.Page;
import com.movie.service.UserService;
import com.movie.service.implement.UserServiceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = {"/admin/user/*"})
public class ManageUser extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserServiceImplement();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        home(req, resp);
    }

    public void home(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageNumber;
        pageNumber = Integer.parseInt(req.getRequestURI().substring(req.getRequestURI().lastIndexOf("/") + 1));
        int pageSize = 10;
        int itemStart = 1 + pageSize * (pageNumber - 1);
        int pageCount = (int) Math.ceil((double) userService.getUsers().size() / (double) pageSize);
        Page page = new Page(pageSize, pageCount, pageNumber, userService.getUsers().size(), itemStart);
        List<User> users = userService.getUserPageAble(true, pageNumber, pageSize);
        req.setAttribute("users", users);
        req.setAttribute("page", page);
        req.getRequestDispatcher("/views/admin/user.jsp").forward(req, resp);
    }

}
