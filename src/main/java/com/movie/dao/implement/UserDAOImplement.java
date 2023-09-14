package com.movie.dao.implement;

import com.movie.dao.AbstractDao;
import com.movie.dao.UserDAO;
import com.movie.entity.User;

import java.util.List;

public class UserDAOImplement extends AbstractDao<User> implements UserDAO {

    @Override
    public List<User> findAll() {
        return super.findAll(User.class);
    }

    @Override
    public User findById(int id) {
        return super.findByID(User.class,id);
    }

    @Override
    public List<User> findByEmail(String email) {
        String sql = "SELECT o FROM User o WHERE email = ?0";
        return super.findByParams(User.class,sql,email);
    }

    @Override
    public List<User> findByActive(boolean active) {
        return super.findAll(User.class);
    }

    @Override
    public User create(User user) {
        return super.create(user);
    }

    @Override
    public User update(User user) {
        return super.update(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public User getUserById(int userId) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
