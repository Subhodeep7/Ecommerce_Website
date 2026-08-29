package com.project5.Ecommz.repo;

import com.project5.Ecommz.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
