package com.systemorders.domain.services;

import com.systemorders.domain.entities.Order;
import com.systemorders.domain.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }
    public Order findById(Long id) {
        return  OrderRepository.findById(id).get();
    }
}
