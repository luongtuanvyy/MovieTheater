package com.movie.controller;

import com.movie.constant.SessionAttr;
import com.movie.entity.User;
import com.movie.service.UserService;
import com.movie.service.implement.UserServiceImplement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login","/logout","/register"})
public class UserController extends HttpServlet {

    private UserService userService = new UserServiceImplement();
    // chưa đưa đường dẫn vào RequestDispatcher
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =req.getSession();
        String path = req.getServletPath();
        switch (path){
            case "/login":
                doGetLogin(req,resp);
                break;
            case "/register":
                doGetRegister(req,resp);
                break;
            case "/logout":
                doGetLogout(session,req,resp);
                break;
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =req.getSession();
        String path = req.getServletPath();
        switch (path){
            case "/login":
                doPostLogin(session,req,resp);
                break;
            case "/register":
                doPostRegister(session,req,resp);
                break;
        }
    }
    // Gắn các đường dẫn vào path
    private void doGetLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user/page/login.html");
        requestDispatcher.forward(req,resp);
    }
    // Gắn các đường dẫn vào path
    private void doGetRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user/page/register.html");
        requestDispatcher.forward(req,resp);
    }
    private void doGetLogout(HttpSession session,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        session.removeAttribute(SessionAttr.CURRENT_USER);
        resp.sendRedirect("index");
    }
    private void doPostLogin(HttpSession session,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String rememberParam = req.getParameter("remember");
        Boolean remember = Boolean.valueOf(rememberParam);

        User user = userService.login(username,password);

        if (user != null){
            if(remember == true){
                session.setAttribute(SessionAttr.CURRENT_USER, user);
                resp.sendRedirect("index");
            }else {
                resp.sendRedirect("index");
            }
        }else {
            resp.sendRedirect("login");
        }
    }
    private void doPostRegister(HttpSession session,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        User user = userService.create(firstname,lastname,username,password,email,phone);

        if (user != null){
            session.setAttribute(SessionAttr.CURRENT_USER, user);
            resp.sendRedirect("index");
        }else {
            resp.sendRedirect("register");
        }
    }
}
