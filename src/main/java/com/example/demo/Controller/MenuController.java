package com.example.demo.Controller;

import com.example.demo.Service.MenuService;
import com.example.demo.dto.RestaurantItem;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @RequestMapping("/menu/findAll")
    public List<RestaurantItem> findAll() {
        return menuService.findAll();
    }

    @RequestMapping("/menu/{id}")
    public RestaurantItem findById(@PathVariable Long id) { return this.menuService.findById(id); }

    @RequestMapping(value = "/menu/create", method = RequestMethod.POST)
    public RestaurantItem create(@RequestBody RestaurantItem restaurantItem) { return this.menuService.create(restaurantItem); }
}
