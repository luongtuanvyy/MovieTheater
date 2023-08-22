package com.movie.dao;

import com.movie.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();
    User findById(int id);
    List<User> findByEmail(String email);
    List<User> findByActive(boolean active);
    User findByUsernameAndPassword(String username, String password);
    User findByUsername(String username);
    User create(User user);
    User update(User user);
    void delete(User user);
}
