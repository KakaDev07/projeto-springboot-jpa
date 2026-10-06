package com.estudospring1.course1.repositories;

import com.estudospring1.course1.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
