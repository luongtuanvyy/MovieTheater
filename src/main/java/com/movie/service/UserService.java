package com.movie.service;

import com.movie.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    List<User> getUserPageAble(boolean active, int pageNumber, int pageSize);

    List<User> findByName(String name);
}
