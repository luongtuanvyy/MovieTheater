package com.movie.controller;

import com.movie.entity.Movies;
import com.movie.service.MovieService;
import com.movie.service.implement.MovieServiceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = { "/findByName", "/findMovieType", "/findAll"})
public class MovieController extends HttpServlet {

    private MovieService movieService;
    @Override
    public void init() throws ServletException {
        movieService = new MovieServiceImplement();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getRequestURI();
        System.out.println(action);
        if ("/movie/findByName".equals(action)) {
            findByName(request, response);
        } else if ("/movie/findMovieType".equals(action)) {
            findMovieType(request, response);
        } else if ("/movie/findAll".equals(action)) {
            findAll(request, response);
        } else {
            System.out.println("");
        }
    }

    private void findByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("name");
//        Movie movie = movieService.findByName(name);
//        request.setAttribute("movie", movie);
        request.getRequestDispatcher("/views/user/page/home.jsp").forward(request, response);
    }

    private void findMovieType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        List<Movies> movies = movieService.findMovieType(type);
        request.setAttribute("movies", movies);
        request.getRequestDispatcher("/views/user/page/home.jsp").forward(request, response);
    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Movies> movies = movieService.findAll();
        request.setAttribute("movies", movies);
        request.getRequestDispatcher("/views/user/page/home.jsp").forward(request, response);
    }
}
