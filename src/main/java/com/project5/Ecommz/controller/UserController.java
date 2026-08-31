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
        try{
            System.out.println("User added to database");
            return userService.registerUser(user);

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }

}
