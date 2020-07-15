package com.example.demo_code9prj.repository;

import com.example.demo_code9prj.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
