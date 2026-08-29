package com.project5.Ecommz.repo;

import com.project5.Ecommz.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Long> {

}
