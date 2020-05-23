package com.stackroute.java.oops.controller;

import com.stackroute.java.oops.model.Product;
import com.stackroute.java.oops.service.ProductServiceImpl;

public class ProductController {

    ProductServiceImpl productService;

    public ProductController() {
        System.out.println("Inside Product Controller..");
        productService = new ProductServiceImpl();
    }

    public Product addProduct(Product product){
        Product addedProduct = productService.addProduct(product);
        return addedProduct;
    }
}
