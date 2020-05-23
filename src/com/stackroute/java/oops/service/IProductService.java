package com.stackroute.java.oops.service;

import com.stackroute.java.oops.model.Product;

import java.util.List;

public interface IProductService {

    public Product addProduct(Product product);
    public Product getProductById(int id);
    public List<Product> getAllProductsList();
    public Product updateProduct(Product product);
    public boolean deleteProduct(int id);
}
