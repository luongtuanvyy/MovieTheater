package com.movie.dao;

import com.movie.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();
    User findById(int id);
    List<User> findByEmail(String email);
    List<User> findByActive(boolean active);
    User create(User user);
    User update(User user);
    void delete(User user);
    User getUserById(int userId);
    User updateUser(User user);

}
