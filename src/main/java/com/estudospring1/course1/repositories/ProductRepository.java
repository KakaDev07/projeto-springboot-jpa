package com.estudospring1.course1.repositories;

import com.estudospring1.course1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>{
}
