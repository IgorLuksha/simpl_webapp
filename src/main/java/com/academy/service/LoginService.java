package com.academy.service;

import com.academy.model.entity.User;
import java.util.ArrayList;
import java.util.List;

public class LoginService {
    private List<User> users;

    public LoginService() {
        users = new ArrayList<>();
        User user = new User("Igor", "123");
        User user1 = new User("Dima", "123");
        User user2 = new User("Ivan", "123");
        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public boolean checkCredentials(String login, String password) {
        for(User user: users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
