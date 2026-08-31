package com.project5.Ecommz.service;

import com.project5.Ecommz.model.User;
import com.project5.Ecommz.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user){
        return userRepository.save(user);
    }
}
