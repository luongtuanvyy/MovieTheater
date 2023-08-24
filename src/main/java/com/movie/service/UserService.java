package com.movie.service;

import com.movie.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(int userId);
    User updateUserInfo(int userId, String firstName, String lastName, String email, String phone);
}
