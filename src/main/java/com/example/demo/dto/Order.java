package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonView;


public class Order {
    @JsonView(com.example.demo.dto.View.Summary.class)
    private Long orderId;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private User customerInfo;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private RestaurantItem restaurantItem;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String quantity;
    @JsonView(View.Summary.class)
    private RestaurantTable restaurantTable;

    public Order() {
    }

    public Order(Long orderId, User customerInfo, RestaurantItem restaurantItem, String quantity, RestaurantTable restaurantTable) {
        this.orderId = orderId;
        this.customerInfo = customerInfo;
        this.restaurantItem = restaurantItem;
        this.quantity = quantity;
        this.restaurantTable = restaurantTable;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public User getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(User customerInfo) {
        this.customerInfo = customerInfo;
    }

    public RestaurantItem getRestaurantItem() {
        return restaurantItem;
    }

    public void setRestaurantItem(RestaurantItem restaurantItem) {
        this.restaurantItem = restaurantItem;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public RestaurantTable getRestaurantTable() {
        return restaurantTable;
    }

    public void setRestaurantTable(RestaurantTable restaurantTable) {
        this.restaurantTable = restaurantTable;
    }


}
