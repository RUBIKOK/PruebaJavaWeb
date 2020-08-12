package com.rubikok.service;

import com.rubikok.entity.Product;
import com.rubikok.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> listAll(){
        return repository.findAll();
    }

    public void saveProduct(Product product){
        repository.save(product);
    }
}
