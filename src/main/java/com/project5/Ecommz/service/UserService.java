package com.project5.Ecommz.service;

import com.project5.Ecommz.model.User;
import com.project5.Ecommz.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user){
        try{
            User newUser = userRepository.save(user);
            System.out.println("User added to database");
            return newUser;

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public User loginUser(String email, String password) {
        //check if user is there or not
        User user  = userRepository.findByEmail(email);
        if(user!=null && user.getPassword().equals(password)){
            return user;
        }return null; ///invalid credentials
    }
    public List<User>  getAllUser(){
        return userRepository.findAll();
    }
}
