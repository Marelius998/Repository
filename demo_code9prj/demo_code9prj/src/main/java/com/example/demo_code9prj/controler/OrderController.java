package com.example.demo_code9prj.controler;

import com.example.demo_code9prj.models.Order;
import com.example.demo_code9prj.repository.BookRepository;
import com.example.demo_code9prj.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController("/orders")
public class OrderController{
    private Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Order> getAll()
    {
        return (List<Order>) orderRepository.findAll();
    }
}
