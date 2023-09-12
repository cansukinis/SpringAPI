package com.cansu.SpringAPI.Service;

import com.cansu.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        User user1 = new User(1, "cansu", 21, "email.com");
        User user2 = new User(2,"merla",21,"merla@gmail.com");
        userList.addAll(Arrays.asList(user1,user2));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
