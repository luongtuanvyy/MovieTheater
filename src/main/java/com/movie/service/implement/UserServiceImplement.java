package com.movie.service.implement;

import com.movie.dao.UserDAO;
import com.movie.dao.implement.UserDAOImplement;
import com.movie.entity.User;
import com.movie.service.UserService;

import java.util.List;

public class UserServiceImplement implements UserService {

    private UserDAO userDAO;

    public UserServiceImplement(){
        userDAO = new UserDAOImplement();
    }

    @Override
    public List<User> getUsers() {
        return userDAO.findAll();
    }

    @Override
    public List<User> getUserPageAble(boolean active, int pageNumber, int pageSize) {
        return userDAO.findPageAble(active, pageNumber, pageSize);
    }

    @Override
    public List<User> findByName(String name) {
        String sql = "SELECT u AS name FROM User u WHERE SUBSTRING_INDEX(u.lastName, ' ', -1) LIKE ?0";
        return userDAO.findByName(sql,name + "%");
    }
}
