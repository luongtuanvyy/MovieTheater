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

    List<User> findPageAble(boolean active, int pageNumber, int pageSize);

    List<User> findByName(String sql, String name);
}
