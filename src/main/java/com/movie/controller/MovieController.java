package com.movie.controller;

import com.movie.entity.Movie;
import com.movie.service.MovieService;
import com.movie.service.implement.MovieServiceIpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = {"/admin/removeMovie", "/admin/doPostMovie", "/api/getAllMovie", "/api/getMovie"})
public class MovieController extends HttpServlet {
    private MovieService movieService;

    @Override
    public void init() throws ServletException {
        this.movieService = new MovieServiceIpml();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id").equals("") ? "-1" : req.getParameter("id");
        Movie movie = this.movieService.getMovieById(id);
        try {
            if (movie != null){
                doUpdateMovie(req, resp);
            } else {
                doCreateMovie(req, resp);
            }
        } catch (Exception e){
            log("Error: " + e.getMessage());
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Movie movie = this.movieService.getMovieById(id);
        try {
            this.movieService.deleteMovie(movie);
            resp.sendRedirect("http://localhost:8081/movie_war/api/getAllMovie");
        } catch (Exception e) {
            log("Error when call deleteMovie: " + e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String urlPattern = req.getServletPath();
        if(urlPattern.equals("/api/getAllMovie")) {
            doGetAllMovie(req, resp);
        } else if (urlPattern.equals("/api/getMovie")) {
            doGetMovie(req, resp);
        }
    }

    private void doGetAllMovie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Movie> movies = new ArrayList<>();
        try {
            movies = this.movieService.getAllMovie();
        } catch (Exception e) {
            log("Error when call getAllMovie: " + e.getMessage());
        }
        req.setAttribute("movies", movies);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/movie.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void doGetMovie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Movie movie = new Movie();
        try {
            movie = this.movieService.getMovieById(id);
        } catch (Exception e) {
            log("Error when call getMovie: " + e.getMessage());
        }
        req.setAttribute("movie", movie);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/editmovie.jsp");
        requestDispatcher.forward(req, resp);
    }

    protected void doCreateMovie (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuffer url = req.getRequestURL();
        int secondSlashIndex = url.indexOf("/", url.indexOf("//") + 2);
        int thirdSlashIndex = url.indexOf("/", secondSlashIndex + 1);
        url.delete(thirdSlashIndex, url.length());
        try {
            Integer id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            byte[] bytesName = name.getBytes("ISO-8859-1");
            name = new String(bytesName, "UTF-8");
            String age = req.getParameter("age");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
            String date = req.getParameter("releaseDate");
            Date releaseDate = dateFormat.parse(date);
            int time = Integer.parseInt(req.getParameter("time"));
            String description = req.getParameter("description");
            byte[] bytesDescription = description.getBytes("ISO-8859-1");
            description = new String(bytesDescription, "UTF-8");
            String type = req.getParameter("type");
            byte[] bytesType = type.getBytes("ISO-8859-1");
            type = new String(bytesType, "UTF-8");
            boolean isActive = req.getParameter("isActive") !=null;
            Movie movie = new Movie(id , name, age, releaseDate, time, description , type, isActive, null);
            Movie resutl = this.movieService.addMovie(movie);
            resp.sendRedirect(url.toString()+"/api/getAllMovie");
        } catch (Exception e) {
            log("Error when call updateMovie: " + e.getMessage());
        }
    }

    protected void doUpdateMovie (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuffer url = req.getRequestURL();
        int secondSlashIndex = url.indexOf("/", url.indexOf("//") + 2);
        int thirdSlashIndex = url.indexOf("/", secondSlashIndex + 1);
        url.delete(thirdSlashIndex, url.length());
        try {
            Integer id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            byte[] bytesName = name.getBytes("ISO-8859-1");
            name = new String(bytesName, "UTF-8");
            String age = req.getParameter("age");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
            String date = req.getParameter("releaseDate");
            Date releaseDate = dateFormat.parse(date);
            int time = Integer.parseInt(req.getParameter("time"));
            String description = req.getParameter("description");
            byte[] bytesDescription = description.getBytes("ISO-8859-1");
            description = new String(bytesDescription, "UTF-8");
            String type = req.getParameter("type");
            byte[] bytesType = type.getBytes("ISO-8859-1");
            type = new String(bytesType, "UTF-8");
            boolean isActive = req.getParameter("isActive") !=null;
            Movie movie = new Movie(id , name, age, releaseDate, time, description , type, isActive, null);
            Movie resutl = this.movieService.updateMovie(movie);
            resp.sendRedirect(url.toString()+"/api/getAllMovie");
        } catch (Exception e) {
            log("Error when call updateMovie: " + e.getMessage());
        }
    }
}
