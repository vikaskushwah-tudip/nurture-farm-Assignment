package com.example.demo.Controller;

import com.example.demo.Service.RestaurantTableService;
import com.example.demo.dto.RestaurantTable;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturantTableController {

    @Autowired
    private RestaurantTableService restaurant_tableService;

    @RequestMapping("/table/findAll")
    public List<RestaurantTable> findAll() { return restaurant_tableService.findAll(); }

    @RequestMapping("/table/{id}")
    public RestaurantTable findById(@PathVariable Long id) { return this.restaurant_tableService.findById(id); }

    @RequestMapping(value = "/table/create", method = RequestMethod.POST)
    public RestaurantTable create(@RequestBody RestaurantTable restaurant_table) { return this.restaurant_tableService.create(restaurant_table); }
}
