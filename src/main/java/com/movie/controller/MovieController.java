package com.movie.controller;

import com.movie.entity.Movie;
import com.movie.service.MovieService;
import com.movie.service.implement.MovieServiceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(urlPatterns = { "/findByTitle", "/findMovieType", "/findAll"})
public class MovieController extends HttpServlet {

    private MovieService movieService;
    @Override
    public void init() throws ServletException {
        movieService = new MovieServiceImplement();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        if ("/findByTitle".equals(action)) {
            findByTitle(request, response);
        } else if ("/finMovieType".equals(action)) {
            findMovieType(request, response);
        } else if ("/findAll".equals(action)) {
            findAll(request, response);
        } else {
        }
    }

    private void findByTitle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        Movie movie = movieService.findByTitle(title);
        request.setAttribute("movie", movie);
        request.getRequestDispatcher("/views/user/demoMovies.jsp").forward(request, response);
    }

    private void findMovieType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        List<Movie> movies = movieService.findMovieType(type);
        request.setAttribute("movies", movies);
        request.getRequestDispatcher("/views/user/demoMovies.jsp").forward(request, response);
    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Movie> movies = movieService.findAll();
        request.setAttribute("movies", movies);
        request.getRequestDispatcher("/views/user/demoMovies.jsp").forward(request, response);
    }
}
