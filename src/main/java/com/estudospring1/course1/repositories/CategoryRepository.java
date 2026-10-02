package com.estudospring1.course1.repositories;

import com.estudospring1.course1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long>{
}
