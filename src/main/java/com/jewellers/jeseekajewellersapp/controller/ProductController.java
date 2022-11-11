package com.jewellers.jeseekajewellersapp.controller;

import com.jewellers.jeseekajewellersapp.entity.Products;
import com.jewellers.jeseekajewellersapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getProducts")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/getProductByName/{productName}")
    public List<Products> getAllProducts(@PathVariable String productName){ //@PathVariable = param must be passed
        return productService.findByProductName(productName);
    }
}
