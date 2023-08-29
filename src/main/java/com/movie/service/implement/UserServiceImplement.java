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
    public User getUserById(int userId) {
        return userDAO.getUserById(userId);
    }
    @Override
    public User updateUserInfo(int userId, String firstName, String lastName, String email, String phone) {
        User user = userDAO.getUserById(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phone);
        return userDAO.updateUser(user);
    }
    }

