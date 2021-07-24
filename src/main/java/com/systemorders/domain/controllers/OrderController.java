package com.systemorders.domain.controllers;

import com.systemorders.domain.entities.Order;
import com.systemorders.domain.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Orders")
public class OrderController {

    @Autowired
    private OrderService OrderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = OrderService.findAll();
         return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = OrderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
