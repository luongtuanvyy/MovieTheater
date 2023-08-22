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
    public User findById(Integer id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }

    @Override
    public User login(String username, String password) {
        return userDAO.findByUsernameAndPassword(username, password);
    }

    @Override
    public User resetPassword(String email) {
        return null;
    }

    @Override
    public User create(String firstName, String lastName, String phone, String username, String password, String email) {
        User newUser = new User();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setPhone(phone);
        newUser.setUserName(username);
        newUser.setPassword(password);
        newUser.setEmail(email);
        newUser.setAdmin(Boolean.FALSE);
        newUser.setActive(Boolean.TRUE);
        newUser.setMember(Boolean.FALSE);
        return userDAO.create(newUser);
    }


    @Override
    public User update(User entity) {
        return userDAO.update(entity);
    }

    @Override
    public User delete(String username) {
        User user = userDAO.findByUsername(username);
        user.setActive(Boolean.FALSE);
        return userDAO.update(user);
    }
}
