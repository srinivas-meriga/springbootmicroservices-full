package com.stanley.techie.orderservice.repository;

import com.stanley.techie.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
