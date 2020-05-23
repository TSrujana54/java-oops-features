package com.stackroute.java.oops.controller.test;

import com.stackroute.java.oops.controller.ProductController;
import com.stackroute.java.oops.model.Product;

public class Test {

    public static void main(String[] args) {
        Product product = new Product(1, "15' Laptop", 34534.345, "Laptop");
        ProductController productController = new ProductController();
        productController.addProduct(product);
    }
}
