package com.project5.Ecommz.controller;

import com.project5.Ecommz.model.User;
import com.project5.Ecommz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")

public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public User registeruser(@RequestBody User user){
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user){
        return userService.loginUser(user.getEmail(),user.getPassword());
    }

}
