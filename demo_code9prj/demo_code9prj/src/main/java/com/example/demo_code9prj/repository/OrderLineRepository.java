package com.example.demo_code9prj.repository;

import com.example.demo_code9prj.models.OrderLine;
import org.springframework.data.repository.CrudRepository;

public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {
}
