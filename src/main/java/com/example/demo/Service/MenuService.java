package com.example.demo.Service;

import com.example.demo.dto.RestaurantItem;
import com.example.demo.dto.RestaurantMenu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {
    private final List<RestaurantItem> resturant_items = new ArrayList<>();
    public MenuService() {

        RestaurantMenu M1 = new RestaurantMenu(1L,"VEG");
        RestaurantMenu M2 = new RestaurantMenu(2L,"NON-VEG");

        RestaurantItem I1 = new RestaurantItem(1L,"CheeseBalls","100",M1,"HOT N CRISPY");
        RestaurantItem I2 = new RestaurantItem(2L,"ChikenLolipop","200",M2,"HOT N CRISPY");
        RestaurantItem I3 = new RestaurantItem(3L,"GoanPrawn","220",M2,"HOT N CRISPY");

        resturant_items.add(I1);
        resturant_items.add(I2);
        resturant_items.add(I3);
    }
    public List<RestaurantItem> findAll() {
        return resturant_items;
    }

    public RestaurantItem findById(Long id) { return this.resturant_items.stream().filter((m) -> m.getItem_ID() == id).findFirst().get(); }

    public RestaurantItem create(RestaurantItem restaurantItem) {
        this.resturant_items.add(restaurantItem);
        return restaurantItem;

    }
}
