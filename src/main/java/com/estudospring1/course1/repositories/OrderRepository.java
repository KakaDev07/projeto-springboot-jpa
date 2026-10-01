package com.estudospring1.course1.repositories;

import com.estudospring1.course1.entities.Order;
import com.estudospring1.course1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long>{
}
