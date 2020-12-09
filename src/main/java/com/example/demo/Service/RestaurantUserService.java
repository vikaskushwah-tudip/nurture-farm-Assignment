package com.example.demo.Service;

import com.example.demo.dto.Role;
import com.example.demo.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantUserService {
    private final List<User> users = new ArrayList<>();

    public RestaurantUserService() {

        Role Admin = new Role(1L, "Admin");
        Role Waiter = new Role(2L, "Waiter");
        Role Customer = new Role(3L, "Customer");


        User brian = new User(1L, "Brian", "Clozel", "bclozel@pivotal.io", "123",Admin);
        User stephane = new User(2L, "Stéphane", "Nicoll", "snicoll@pivotal.io", "1000",Waiter);
        User rossen = new User(3L, "Rossen", "Stoyanchev", "rstoyanchev@pivotal.io", "32456",Customer);

        users.add(brian);
        users.add(stephane);
        users.add(rossen);
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(Long id) {
        return this.users.stream().filter((m) -> m.getId() == id).findFirst().get();
    }

    public User create(User message) {
        this.users.add(message);
        return message;
    }
}

