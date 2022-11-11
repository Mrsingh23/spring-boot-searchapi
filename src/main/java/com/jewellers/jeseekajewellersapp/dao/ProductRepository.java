package com.jewellers.jeseekajewellersapp.dao;

import com.jewellers.jeseekajewellersapp.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Integer> {
    /*For custom query @param name should be exactly as entity*/
    public List<Products> findByProductName(String productName);
}
