package com.example.demo.Controller;

import com.example.demo.Service.OrderService;
import com.example.demo.dto.Order;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/order/findAll")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @RequestMapping("/order/{id}")
    public Order findById(@PathVariable Long id) {
        return this.orderService.findById(id);
    }

    @RequestMapping(value = "/order/Create", method = RequestMethod.POST)
    public Order create(@RequestBody Order order) { return this.orderService.create(order);}
}
