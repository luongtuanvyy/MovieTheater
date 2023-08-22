package com.movie.service;

import com.movie.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User findById(Integer id);
    List<User> findByEmail(String email);
    User findByUsername(String username);
    User login(String username, String password);
    User resetPassword(String email);
    User create(String firstName,String lastName,String phone,String username, String password, String email);
    User update(User entity);
    User delete(String username);
}
