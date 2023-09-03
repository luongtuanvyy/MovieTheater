package com.movie.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.movie.entity.Movie;
import com.movie.service.MovieService;
import com.movie.service.implement.MovieServiceIpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/admin/addMovie", "/admin/removeMovie", "/admin/updateMovie", "/api/getMovies"})
public class MovieController extends HttpServlet {
    private MovieService movieService;
    private ObjectMapper objectMapper;

    @Override
    public void init() throws ServletException {
        this.movieService = new MovieServiceIpml();
        this.objectMapper = new ObjectMapper();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String urlPattern = req.getServletPath();
        if(urlPattern.equals("/admin/addMovie")) {
            BufferedReader reader = req.getReader();
            StringBuilder body = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                body.append(line);
            }

            String requestBody = body.toString();
            Movie movie = this.objectMapper.readValue(requestBody, Movie.class);

            try {
                Movie result =  this.movieService.addMovie(movie);
            } catch (Exception e) {
                log("Error when call addMovie: " + e.getMessage());
            }
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/editmovie.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String urlPattern = req.getServletPath();
        if(urlPattern.equals("/admin/removeMovie")) {
            BufferedReader reader = req.getReader();
            StringBuilder body = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                body.append(line);
            }

            String requestBody = body.toString();
            Movie movie = this.objectMapper.readValue(requestBody, Movie.class);

            try {
                this.movieService.deleteMovie(movie);
            } catch (Exception e) {
                log("Error when call deleteMovie: " + e.getMessage());
            }
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/editmovie.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String urlPattern = req.getServletPath();
        if(urlPattern.equals("/api/getMovies")) {
            try {
                List<Movie> result = this.movieService.getAllMovie();
                req.setAttribute("movies", result);
            } catch (Exception e) {
                log("Error when call getMovie: " + e.getMessage());
            }
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/editmovie.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String urlPattern = req.getServletPath();
        if(urlPattern.equals("/admin/updateMovie")) {
            BufferedReader reader = req.getReader();
            StringBuilder body = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                body.append(line);
            }

            String requestBody = body.toString();
            Movie movie = this.objectMapper.readValue(requestBody, Movie.class);

            try {
                Movie resutl = this.movieService.updateMovie(movie);
            } catch (Exception e) {
                log("Error when call updateMovie: " + e.getMessage());
            }
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/editmovie.jsp");
        requestDispatcher.forward(req, resp);
    }
}
