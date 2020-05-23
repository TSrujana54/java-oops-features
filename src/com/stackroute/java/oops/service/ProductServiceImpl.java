package com.stackroute.java.oops.service;

import com.stackroute.java.oops.model.Product;
import com.stackroute.java.oops.repository.MongoRepository;
import com.stackroute.java.oops.repository.MySQLRepository;

import java.util.List;

public class ProductServiceImpl implements IProductService{

    //MySQLRepository mySQLRepository;
    MongoRepository mongoRepository;

    public ProductServiceImpl() {
       // mySQLRepository =
        mongoRepository = new MongoRepository();
    }

    @Override
    public Product addProduct(Product product) {
      Product addedProduct =  mongoRepository.addProductToDB(product);
        return addedProduct;
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public List<Product> getAllProductsList() {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(int id) {
        return false;
    }
}
