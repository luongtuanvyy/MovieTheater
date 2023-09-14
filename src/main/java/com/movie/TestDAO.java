package com.movie;

import com.movie.entity.User;
import com.movie.service.UserService;
import com.movie.service.implement.UserServiceImplement;

import java.util.List;

public class TestDAO {

    public static void main(String[] args) {
        UserService userService = new UserServiceImplement();
        List<User> users = userService.findByName("abc");
        System.out.println(users.size());
        for (User user: users) {
            System.out.println(user.isActive());
        }
    }
}
