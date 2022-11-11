package com.jewellers.jeseekajewellersapp.service;

import com.jewellers.jeseekajewellersapp.dao.ProductRepository;
import com.jewellers.jeseekajewellersapp.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Products> findByProductName(String productName){
        return productRepository.findByProductName(productName);
    }
}
