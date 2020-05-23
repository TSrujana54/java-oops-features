package com.stackroute.java.oops.repository;

import com.stackroute.java.oops.model.Product;

public class MongoRepository {

    public Product addProductToDB(Product product){
        System.out.println("Connected to Mongo DB");
        System.out.println("Product is inserted successfully To Mongo");
        return product;
    }
}
