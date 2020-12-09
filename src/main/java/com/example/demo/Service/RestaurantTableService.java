package com.example.demo.Service;


import com.example.demo.dto.RestaurantTable;
import com.example.demo.dto.Role;
import com.example.demo.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantTableService {
    private final List<RestaurantTable> tables = new ArrayList<>();
    public RestaurantTableService() {
        Role Admin = new Role(1L, "Admin");
        Role Waiter = new Role(2L, "Waiter");

        User brian = new User(1L, "Brian", "Clozel", "bclozel@pivotal.io", "123",Admin);

        RestaurantTable T1 = new RestaurantTable(1L,"4 seat" ,"Four people Only",brian,"Available",Waiter);
        RestaurantTable T2 = new RestaurantTable(2L, "2 seat round","Two people can sit",brian,"Available",Waiter);
        RestaurantTable T3 = new RestaurantTable(3L,"1 seat","One person can sit",brian,"Available",Waiter);

        tables.add(T1);
        tables.add(T2);
        tables.add(T3);
    }
    public List<RestaurantTable> findAll() {
        return tables;
    }

    public RestaurantTable findById(Long id) { return this.tables.stream().filter((m) -> m.getTableId() == id).findFirst().get(); }

    public RestaurantTable create(RestaurantTable restaurant_table) {
    if (restaurant_table.getCreatedby().getRoles().getId() ==1)
    {
    this.tables.add(restaurant_table);
    return restaurant_table;
    }
    else return null;
    }
}
