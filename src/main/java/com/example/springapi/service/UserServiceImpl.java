package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    //Since there is no database connected here,
    // we create a ArrayList of Users and simulate it.

    ArrayList<User> userArrayList = new ArrayList<>(Arrays.asList(
            new User(1, "borabesiktepe", 15, "Warrior", "bora@mail.com"),
            new User(2, "Wackrianx", 26, "Mage", "wackrianx@mail.com"),
            new User(3, "Looby_ott", 4, "Warlock", "looby@mail.com"),
            new User(4, "Avenuetle867", 46, "Death Knight", "ave867@mail.com"),
            new User(4, "Queemhrey", 32, "Monk", "queemhrey@mail.com")
    ));
    public User getUserById(int id) {
        for (User user : userArrayList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
