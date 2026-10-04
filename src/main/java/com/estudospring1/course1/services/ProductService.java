package com.estudospring1.course1.services;

import com.estudospring1.course1.repositories.ProductRepository;
import com.estudospring1.course1.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional <Product> obj = repository.findById(id);
        return obj.get();
    }
}
