package com.example.demo.Service;

import com.example.demo.dto.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<>();
    public OrderService() {
        Role Admin = new Role(1L, "Admin");
        Role Waiter = new Role(2L, "Waiter");
        Role Customer = new Role(3L, "Customer");

        User brian = new User(1L, "Brian", "Clozel", "bclozel@pivotal.io", "123",Admin);
        User rossen = new User(3L, "Rossen", "Stoyanchev", "rstoyanchev@pivotal.io", "32456",Customer);

        RestaurantTable T1 = new RestaurantTable(1L,"4 seat" ,"Four people Only",brian,"Available",Waiter);
        RestaurantTable T2 = new RestaurantTable(2L, "2 seat round","Two people can sit",brian,"Available",Waiter);
        RestaurantTable T3 = new RestaurantTable(3L,"1 seat","One person can sit",brian,"Available",Waiter);
        BookingInfo B1 = new BookingInfo(1L,T1 ,rossen,"4" ,"Processing");
        RestaurantMenu M1 = new RestaurantMenu(1L,"VEG");
        RestaurantMenu M2 = new RestaurantMenu(2L,"NON-VEG");

        RestaurantItem I1 = new RestaurantItem(1L,"CheeseBalls","100",M1,"HOT N CRISPY");
        RestaurantItem I2 = new RestaurantItem(2L,"ChikenLolipop","200",M2,"HOT N CRISPY");
        RestaurantItem I3 = new RestaurantItem(3L,"GoanPrawn","220",M2,"HOT N CRISPY");
        Order O1 = new Order(1L,rossen,I2,"1",T3);
        Order O2 = new Order(2L,rossen,I1,"1",T3);
        Order O3 = new Order(3L,rossen,I3,"1",T3);

        orders.add(O1);
        orders.add(O2);
        orders.add(O3);

    }
    public List<Order> findAll() {
        return orders;
    }

    public Order findById(Long id) { return this.orders.stream().filter((m) -> m.getOrderId() == id).findFirst().get(); }

    public Order create(Order order) {
        this.orders.add(order);
        return order;
    }
}
