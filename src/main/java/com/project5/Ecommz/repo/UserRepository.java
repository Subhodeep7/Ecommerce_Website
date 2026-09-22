package com.project5.Ecommz.repo;

import com.project5.Ecommz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
