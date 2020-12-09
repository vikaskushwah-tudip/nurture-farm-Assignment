package com.example.demo.Controller;

import com.example.demo.Service.RestaurantUserService;
import com.example.demo.dto.User;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private RestaurantUserService res_UserService;

    @RequestMapping("/user/findAll")
    public List<User> findAll() {
        return res_UserService.findAll();
    }


    @RequestMapping("/user/{id}")
    public User findById(@PathVariable Long id) { return this.res_UserService.findById(id); }

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public User create(@RequestBody User message) {
        return this.res_UserService.create(message);
    }

}

